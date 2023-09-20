package com.store.autopista.mx.backend.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAuthorityMix {
	
	@JsonCreator
	public SimpleGrantedAuthorityMix(@JsonProperty("authority") String role) {
		
	}

}
