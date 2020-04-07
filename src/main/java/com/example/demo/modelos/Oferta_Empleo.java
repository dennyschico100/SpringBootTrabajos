package com.example.demo.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oferta_empleo")
public class Oferta_Empleo {

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getNombre_empresa() {
		return nombre_empresa;
	}
	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}
	public String getArea_empresa() {
		return area_empresa;
	}
	public void setArea_empresa(String area_empresa) {
		this.area_empresa = area_empresa;
	}
	public String getTitulo_oferta() {
		return titulo_oferta;
	}
	public void setTitulo_oferta(String titulo_oferta) {
		this.titulo_oferta = titulo_oferta;
	}
	public String getCargo_solicitado() {
		return cargo_solicitado;
	}
	public void setCargo_solicitado(String cargo_solicitado) {
		this.cargo_solicitado = cargo_solicitado;
	}
	public int getPuestos_vacantes() {
		return puestos_vacantes;
	}
	public void setPuestos_vacantes(int puestos_vacantes) {
		this.puestos_vacantes = puestos_vacantes;
	}
	public String getTipo_de_contratacion() {
		return tipo_de_contratacion;
	}
	public void setTipo_de_contratacion(String tipo_de_contratacion) {
		this.tipo_de_contratacion = tipo_de_contratacion;
	}
	public String getNivel_emperiencia() {
		return nivel_emperiencia;
	}
	public void setNivel_emperiencia(String nivel_emperiencia) {
		this.nivel_emperiencia = nivel_emperiencia;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public int getSalario_minimo() {
		return salario_minimo;
	}
	public void setSalario_minimo(int salario_minimo) {
		this.salario_minimo = salario_minimo;
	}
	public int getSalario_maximo() {
		return salario_maximo;
	}
	public void setSalario_maximo(int salario_maximo) {
		this.salario_maximo = salario_maximo;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
	public Date getExpireacion() {
		return expireacion;
	}
	public void setExpireacion(Date expireacion) {
		this.expireacion = expireacion;
	}
	
	public Oferta_Empleo(int id, int id_empresa, String nombre_empresa, String area_empresa, String titulo_oferta,
			String cargo_solicitado, int puestos_vacantes, String tipo_de_contratacion, String nivel_emperiencia,
			int genero, String edad, int salario_minimo, int salario_maximo, String vehiculo, String pais,
			String departamento, int estado, Date created_at, Date expireacion) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.nombre_empresa = nombre_empresa;
		this.area_empresa = area_empresa;
		this.titulo_oferta = titulo_oferta;
		this.cargo_solicitado = cargo_solicitado;
		this.puestos_vacantes = puestos_vacantes;
		this.tipo_de_contratacion = tipo_de_contratacion;
		this.nivel_emperiencia = nivel_emperiencia;
		this.genero = genero;
		this.edad = edad;
		this.salario_minimo = salario_minimo;
		this.salario_maximo = salario_maximo;
		this.vehiculo = vehiculo;
		this.pais = pais;
		this.departamento = departamento;
		this.estado = estado;
		this.created_at = created_at;
		this.expireacion = expireacion;
	}
	
	public Oferta_Empleo() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id ;

	@Column(name = "id_empresa")
	int id_empresa;
	
	@Column(name="nombre_empresa")
	
	String nombre_empresa;
	@Column(name="area_empresa")
	
	String area_empresa;
	
	@Column(name="titulo_oferta")
	String titulo_oferta;
	
	@Column(name="cargo_solicitado")
	String cargo_solicitado;
	
	@Column(name="puestos_vacantes")
	int puestos_vacantes;
	
	
	@Column(name="tipo_de_contratacion")
	String tipo_de_contratacion;
	
	
	@Column(name="nivel_experienca")
	String nivel_emperiencia;
	
	@Column(name="genero")
	int genero;
	
	@Column(name="edad")
	String edad;
	
	@Column(name="salario_minimo")
	int salario_minimo;
	
	@Column(name="salario_maximo")
	int salario_maximo;
	
	@Column(name="vehiculo")
	String vehiculo;
	
	@Column(name="pais")
	String pais;
	
	@Column(name="departamento")
	String departamento;
	
	@Column(name="estado")
	int estado;
	@Column(name="created_at")
	Date created_at;
	
	@Column(name="expiracion")
	Date expireacion;
		
}
