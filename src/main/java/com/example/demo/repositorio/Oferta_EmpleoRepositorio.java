package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.Oferta_Empleo;

public interface Oferta_EmpleoRepositorio  extends JpaRepository<Oferta_Empleo,Long> {	

	
}
