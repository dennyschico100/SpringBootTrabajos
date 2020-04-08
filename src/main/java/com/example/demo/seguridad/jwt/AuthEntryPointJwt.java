package com.example.demo.seguridad.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@Component
public class AuthEntryPointJwt  implements AuthenticationEntryPoint {

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		//LUEGO
		logger.error("Unauthorized error: {}",authException.getMessage());
		response.sendError(HttpServletResponse.SC_ACCEPTED,"Error: Unauthorized" );
		//HttpServletResponse.SC_UNAUTHORIZED is the 401 Status
		//code. It indicates that the request requires HTTP authentication.
		
	}	
	
	
	
}
