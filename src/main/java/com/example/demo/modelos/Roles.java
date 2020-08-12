package com.example.demo.modelos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.modelos.ERoles;;

@Entity
@Table(name = "roles")
public class Roles {

	
	
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id_rol;
	
	@Enumerated(EnumType.STRING )
	@Column(length = 20)
	private ERoles nombre;
	
	public ERoles getNombre() {
		return nombre;
	}
	public void setNombre(ERoles nombre) {
		this.nombre = nombre;
	}
	public Roles() {
		
	}
	
}
