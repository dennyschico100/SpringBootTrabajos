package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Usuarios;

@Repository
public interface UsuarioRepositorio  extends  JpaRepository<Usuarios,Long > {

	Boolean existsByEmail(String email);
	
}
