package com.example.demo.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.demo.modelos.Oferta_Empleo;
import com.example.demo.repositorio.Oferta_EmpleoRepositorio;
import com.example.demo.seguridad.ResourceNotFoundException;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@CrossOrigin(origins = "*" ,allowedHeaders = "*" )
@RestController
@RequestMapping("/api/")
public class Oferta_EmpleoController {
	

	@Autowired
	Oferta_EmpleoRepositorio   oferta_EmpleoR;
	
	@PostMapping("crear")
	public boolean add2(@Valid @RequestBody Oferta_Empleo o ) {
		oferta_EmpleoR.save(o);
		
		return true;
		
	}
	
	@PreAuthorize("hasRole('USER')")
	@PostMapping("oferta_empleo/")
	public ResponseEntity<Oferta_Empleo> addOferta(
			@Valid @RequestBody Oferta_Empleo oferta  ) {
		try {
			System.out.print(oferta.getNivel_de_experiencia());
		      Oferta_Empleo oferta_Empleo = oferta_EmpleoR
		          .save(oferta);
		          return new ResponseEntity<>(oferta_Empleo,HttpStatus.CREATED);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		    }
		//return productosRep.save(pro);
		
	}
	
	@PreAuthorize("hasRole('USER')")
	@PutMapping(value = "oferta_empleado/{id}")
	public ResponseEntity<Oferta_Empleo> update(@PathVariable(value = "id")  Long  id, @Valid 
			 @RequestBody Oferta_Empleo o ) throws ResourceNotFoundException {
	

	Oferta_Empleo ofer = oferta_EmpleoR.findById(id)
			.orElseThrow(()->new ResourceAccessException(" OFERTA con id : "+id+" No eccontrada ") 
	 );	
				
		//ofer.setArea_empresa(o.getArea_empresa());
		final Oferta_Empleo oferta_Empleo_updatedEmpleo =oferta_EmpleoR.save(o);
		return ResponseEntity.ok(oferta_Empleo_updatedEmpleo);
		
	} 
	
	@GetMapping("oferta_empleo/")
	public List<Oferta_Empleo> listarOfertas(){
		return oferta_EmpleoR.findAll();
	}
	
	@GetMapping( value="oferta_empleo/{id}")
	public ResponseEntity<Oferta_Empleo> obtenerOferta(@PathVariable(value="id")  long id )
	throws ResourceNotFoundException {
		Oferta_Empleo oferta_Empleo = oferta_EmpleoR.findById(id)
				
				.orElseThrow( 
()-> new ResourceNotFoundException("OFERTA NO  Id:"+id+" NO ENCONTRADO")

						);
		
		return ResponseEntity.ok().body(oferta_Empleo);
															
}
	
	
	
}
