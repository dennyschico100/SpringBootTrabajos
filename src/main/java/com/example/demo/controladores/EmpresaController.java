package com.example.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.*;
import com.example.demo.repositorio.*;
import com.example.demo.seguridad.ResourceNotFoundException;


@CrossOrigin(origins = "*" ,allowedHeaders = "*" )
@RestController
@RequestMapping("/api/")
public class EmpresaController {

	

	@Autowired
	EmpresaRepositorio empresaRepositorio;
	
	@GetMapping("empresa")

	@PreAuthorize("hasRole('USER')")
	public List<Empresa> listarOfertas(){
		return empresaRepositorio.findAll();
	}
	
	@GetMapping(value="empresa/{id}")
	public ResponseEntity<Empresa> obtenerOferta(@PathVariable(value="id")  long id )
	throws ResourceNotFoundException {
		Empresa empresa = empresaRepositorio.findById(id)
				
				.orElseThrow( 
()-> new ResourceNotFoundException("OFERTA NO  Id:"+id+" NO ENCONTRADO")

						);
		
		return ResponseEntity.ok().body(empresa);
															
}
	



}
