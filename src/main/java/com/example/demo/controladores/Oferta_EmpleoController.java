package com.example.demo.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.Oferta_Empleo;
import com.example.demo.repositorio.Oferta_EmpleoRepositorio;

@CrossOrigin(origins = "*" ,allowedHeaders = "*" )
@RestController
@RequestMapping("/api/")
public class Oferta_EmpleoController {
	

	@Autowired
	Oferta_EmpleoRepositorio   oferta_EmpleoR;
	
	@PostMapping("oferta_empleo")
	public ResponseEntity<Oferta_Empleo> addOferta(
			@Valid @RequestBody Oferta_Empleo oferta  ) {
		try {
		      Oferta_Empleo oferta_Empleo = oferta_EmpleoR
		          .save(oferta);
		          return new ResponseEntity<>(oferta_Empleo, HttpStatus.CREATED);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		    }
		//return productosRep.save(pro);
		
	}
	
}
