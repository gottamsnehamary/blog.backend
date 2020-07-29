package com.example.blog.backend.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
	
	public AuthenticationResponse(String authenticationToken,String username) {
		this.authenticationToken=authenticationToken;
		this.username=username;
		
	}
 
	
	private String authenticationToken;
    private String username;
}
