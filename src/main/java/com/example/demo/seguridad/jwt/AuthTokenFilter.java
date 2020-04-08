package com.example.demo.seguridad.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.seguridad.servicios.UserDetailsServiceImpl;

public class AuthTokenFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtils jwtUtils;
	//LUEGO CREO UNA CLASE 
	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		System.out.println(" soy del get user and AUTHTOKEM FILTER "); 
		System.out.println(request.getRequestURI());
		System.out.println(request.getHeader("Authorization"));
		
		
		System.out.println("ANTES DE REVISAR EL JWT");
		
		//

//com.example.demo.seguridad.jwt.AuthTokenFilter.parseJwt(HttpServletRequest request)
		//
		String jwt = parseJwt(request);
		System.out.println(parseJwt(request));
		
		System.out.println("ANTES DE ENTRAR AL TRY");
		
		try {
			//String username1 = jwtUtils.getUserNameFromJwtToken(jwt);
			//System.out.println("USER NAME 1 MAN "+username1);
				
			if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
				String username = jwtUtils.getUserNameFromJwtToken(jwt);
				
					System.out.print(username); 
					System.out.print(" soy del get user and AUTHTOKEM FILTER "); 
					
				UserDetails userDetails = userDetailsService.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		} catch (Exception e) {
			logger.error("Cannot set user authentication: {}", e);
		}

		filterChain.doFilter(request, response);
		
		
	}
	
	private String parseJwt(HttpServletRequest request) {
		String headerAuth = request.getHeader("Authorization");

		//LIBRERERI ADEL SPOIRNG FRAMEWORK
		if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer")) {
			System.out.print("************************+");
			String aux="";
			aux= headerAuth.substring(6, headerAuth.length());
			System.out.print(aux);
			
			return aux;
			
		}

		return null;
	}

	
	
}
