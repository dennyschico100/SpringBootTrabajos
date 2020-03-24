package com.example.demo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.ERoles;
import com.example.demo.modelos.Roles;

@Repository
public interface RolesRepositorio  extends JpaRepository<Roles, Long > {

	Optional<Roles>  findByNombre(ERoles name);
	/*
	 Un repositorio contiene métodos para realizar operaciones CRUD,
	  ordenar y paginar datos. @Repositoryes una anotación de marcador, 
	  que indica que la interfaz subyacente es un repositorio.
	   Un repositorio se crea mediante la extensión de las interfaces 
	   de repositorio específicos, tales como CrudRepository,
	  PagingAndSortingRepository, o JpaRepositorys 
	 
	 */
	
}
