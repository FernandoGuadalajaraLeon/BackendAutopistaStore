package com.store.autopista.mx.backend.security;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
	

	public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String bearerToken = request.getHeader("Authorization");
		
		if(bearerToken == null || !bearerToken.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		boolean validToken;
		Claims token = null;
		try {
			token = Jwts.parserBuilder().setSigningKey("8schwh9c89c9ycdhy9u99UYU9ysIHBk8".getBytes()).build()
					.parseClaimsJws(bearerToken.replace("Bearer ", ""))
					.getBody();
			
			validToken = true;
		} catch (JwtException e) {
			validToken = false;
		}
		
		UsernamePasswordAuthenticationToken authenticationToken = null;
		if(validToken) {
			String username = token.getSubject();
			Object roles = token.get("authorities");
			System.out.println("Datos desde Token - Username: "+username+", Roles: "+roles.toString());
			Collection<? extends GrantedAuthority> auth = Arrays.asList(new ObjectMapper().
					addMixIn(SimpleGrantedAuthority.class, SimpleGrantedAuthorityMix.class).
					readValue(roles.toString().getBytes(), SimpleGrantedAuthority[].class));
			
			authenticationToken = new UsernamePasswordAuthenticationToken(username, null, auth);
			
//			authenticationToken = TokenUtils.getAuthentication(bearerToken.replace("Bearer ", ""));
		}
		
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		filterChain.doFilter(request, response);
		
//		if(bearerToken != null && bearerToken.startsWith("Bearer ")) {
//			String token = bearerToken.replace("Bearer ", "");
//			UsernamePasswordAuthenticationToken oauth = TokenUtils.getAuthentication(token);
//			SecurityContextHolder.getContext().setAuthentication(oauth);
//		}
//		filterChain.doFilter(request, response);
	}

}