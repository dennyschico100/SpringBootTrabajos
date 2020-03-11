package com.example.demo.modelos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios",uniqueConstraints = {
		
		@UniqueConstraint(columnNames = "email")
} )
public class Usuarios {


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_roles",
				joinColumns = @JoinColumn(name = "id_usuario" ),
				inverseJoinColumns = @JoinColumn(name="id_role")
			)
	private Set<Roles> roles = new HashSet<>();
	
	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int  id_usuario;
	
	@NotBlank
	@Size(max=100)
	
	private String nombres;
	
	@NotBlank
	@Size(max=100)
	
	private String apellidos;
	
	
	@Email
	@NotBlank
	private String email;
	
	
	
	@NotBlank
	@Size(min=6)
	
	private String contraseña;
	@NotBlank
	@Size(min=6)
	
	private String contraseña2;
	
	@NotBlank
	private String nacionalidad;
	private int genero;
	private int edad; 
	private Date fecha_nacimiento;
	private String telefono;
	private int estado;
	private Date created_at;
	
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getContraseña2() {
		return contraseña2;
	}
	public void setContraseña2(String contraseña2) {
		this.contraseña2 = contraseña2;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	

	
	
}
