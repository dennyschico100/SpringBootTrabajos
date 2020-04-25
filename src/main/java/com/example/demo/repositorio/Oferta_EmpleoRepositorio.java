package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.Oferta_Empleo;


public interface Oferta_EmpleoRepositorio  extends JpaRepository<Oferta_Empleo,Long> {	

	List<Oferta_Empleo> findByArea(String area );

	
}
