package com.store.autopista.mx.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.autopista.mx.backend.entity.Role;
import com.store.autopista.mx.backend.entity.Usuario;
import com.store.autopista.mx.backend.repository.JpaUserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {
	
	protected final Log logger = LogFactory.getLog(JpaUserDetailsService.class);

	@Autowired
	private JpaUserRepository usuarioRepository;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
        Usuario usuario = usuarioRepository.findByUsername(username);
        
        if(usuario == null) {
        	throw new UsernameNotFoundException("Username: " + username + " no existe en el sistema!");
        }
        
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        for(Role role: usuario.getRoles()) {
        	logger.info("Agregando rol del usuario: "+ usuario.getUsername() + " - " + role);
        	authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        }
        
        if(authorities.isEmpty()) {
        	throw new UsernameNotFoundException("Error en el Login: usuario '" + username + "' no tiene roles asignados!");
        }
        
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isActivo(), true, true, true, authorities);
	}

}