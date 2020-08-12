package com.example.demo.seguridad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelos.Usuarios;
import com.example.demo.modelos.*;
import com.example.demo.repositorio.UsuarioRepositorio;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UsuarioRepositorio userRepository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		System.out.print("SI ENTRA LA METOOD");
		Usuarios user = userRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + email));

		return UserDetailsImpl.build(user);
	}

}
