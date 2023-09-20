package com.store.autopista.mx.backend.security;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.autopista.mx.backend.entity.Usuario;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		
		String username = obtainUsername(request);
		String password = obtainPassword(request);	
		
		if(username != null && password !=null) {
			logger.info("Username desde request parameter (form-data): " + username);
			logger.info("Password desde request parameter (form-data): " + password);
			
		} else {
			Usuario user = null;
			try {
				
				user = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);
				
				username = user.getUsername();
				password = user.getPassword();
				
				logger.info("Username desde request InputStream (raw): " + username);
				logger.info("Password desde request InputStream (raw): " + password);
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		UsernamePasswordAuthenticationToken oauth = new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList());
		
		return getAuthenticationManager().authenticate(oauth);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {

 
		User user = (User)authResult.getPrincipal();
		String token = TokenUtils.createToken(user.getUsername(), authResult);
		
		response.addHeader("Authorization", "Bearer " + token);
		response.getWriter().flush();
		
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("token", token);
		body.put("user", user);
		body.put("message", "Sesion iniciada con exito");
		
		response.getWriter().write(new ObjectMapper().writeValueAsString(body));
		response.setStatus(200);
		response.setContentType("application/json");
		
		super.successfulAuthentication(request, response, chain, authResult);
	}

	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException failed) throws IOException, ServletException {

		Map<String, Object> body = new HashMap<String, Object>();
		body.put("message", "Error de autenticacion: username o password incorrectos");
		body.put("error", failed.getMessage());
		
		response.getWriter().write(new ObjectMapper().writeValueAsString(body));
		response.setStatus(401);
		response.setContentType("application/json");
		
//		super.unsuccessfulAuthentication(request, response, failed);
	}

}


