package com.example.demo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Usuarios;

@Repository
public interface UsuarioRepositorio  extends  JpaRepository<Usuarios,Long > {

	Optional<Usuarios>	findByEmail(String email);
	
	
	
	Boolean existsByEmail(String email);
}
