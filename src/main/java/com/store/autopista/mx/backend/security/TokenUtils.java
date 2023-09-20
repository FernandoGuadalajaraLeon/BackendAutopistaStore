package com.store.autopista.mx.backend.security;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class TokenUtils {

	private static final String ACCESS_TOKEN_SECRET = "8schwh9c89c9ycdhy9u99UYU9ysIHBk8";
	private static final Long ACCESS_TOKEN_VALIDITY_SECCONDS = 2_592_000L;

	public static String createToken(String username, Authentication authResult) throws JsonProcessingException {

		long expirationTime = ACCESS_TOKEN_VALIDITY_SECCONDS * 1_000;
		Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);

		Map<String, Object> extra = new HashMap<>();
		extra.put("nombre", username);
		
//		Collection<? extends GrantedAuthority> roles =  authResult.getAuthorities();
//		
//		Claims claims = Jwts.claims();
//		claims.put("authorities", new ObjectMapper().writeValueAsString(roles));
		
		extra.put("authorities", new ObjectMapper().writeValueAsString( authResult.getAuthorities() ));

		return Jwts.builder().setSubject(username).setExpiration(expirationDate).addClaims(extra)//.setClaims(claims)
				.signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes())).compact();
	}

	public static UsernamePasswordAuthenticationToken getAuthentication(String token) {

		try {
			Claims claims = Jwts.parserBuilder().setSigningKey(ACCESS_TOKEN_SECRET.getBytes()).build()
					.parseClaimsJwt(token).getBody();

			String email = claims.getSubject();

			return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
		} catch (JwtException e) {
			return null;
		}

	}

}