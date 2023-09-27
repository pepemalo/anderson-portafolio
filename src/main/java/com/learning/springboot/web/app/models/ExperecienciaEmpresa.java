package com.learning.springboot.web.app.models;

import org.springframework.stereotype.Component;



//Necesario para aplicar la inyeccion
@Component
public class ExperecienciaEmpresa {
	
	private String nombreEmpresa = "";
	private String direccion = "";
	private String pais = "";
	private String departamento = "";
	private String ciudad = "";
	private String descripcion = "";
	
	

	private int nit = 0;
	private String telefonoContacto = "";
	
	public ExperecienciaEmpresa() {
		// TODO Auto-generated constructor stub
	}

	//Contructor con Parametros
	public ExperecienciaEmpresa(String nombreEmpresa, String direccion, String pais, String departamento, String ciudad,String descripcion,
		int nit, String telefonoContacto) {
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
		this.pais = pais;
		this.descripcion = descripcion;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.nit = nit;
		this.telefonoContacto = telefonoContacto;
	}
	
	
	//Creacion de Getter y Setter
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
