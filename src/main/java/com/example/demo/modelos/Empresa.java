package com.example.demo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.omg.CORBA.PRIVATE_MEMBER;

@Entity
@Table(name = "empresa")
public class Empresa {


public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}


	public int getNo_registro() {
		return no_registro;
	}


	public void setNo_registro(int no_registro) {
		this.no_registro = no_registro;
	}


	public String getNombre_empresa() {
		return nombre_empresa;
	}


	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getSitio_web() {
		return sitio_web;
	}


	public void setSitio_web(String sitio_web) {
		this.sitio_web = sitio_web;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


@Id
@Column(name = "id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;



@Column(name = "no_registro")
private int no_registro; 



@Column(name = "nombre_empresa")
private String nombre_empresa;


@Column(name = "area")
private String area;


@Column(name = "sitio_web")
private String sitio_web;


@Column(name = "logo")
private String logo;


@Column(name = "estado")
private int estado;


}
