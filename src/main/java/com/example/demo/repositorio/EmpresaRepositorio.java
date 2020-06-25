package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelos.Empresa;

public interface EmpresaRepositorio  extends JpaRepository<Empresa, Long>  {

}
