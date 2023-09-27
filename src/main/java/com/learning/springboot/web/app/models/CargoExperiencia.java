package com.learning.springboot.web.app.models;

import java.util.*;

import org.springframework.stereotype.Component;


//Necesario para aplicar la inyeccion
@Component
public class CargoExperiencia {
	
	private String nombreCargo = "";
	private String descripcionCargo = "";
	private Date inicioFecha;
	private Date finFecha;
	

	
	public CargoExperiencia() {
		// TODO Auto-generated constructor stub
	}
	public CargoExperiencia(String nombreCargo, String descripcionCargo, Date inicioFecha, Date finFecha) {
		this.nombreCargo = nombreCargo;
		this.descripcionCargo = descripcionCargo;
		this.inicioFecha = inicioFecha;
		this.finFecha = finFecha;
	}
	public String getNombreCargo() {
		return nombreCargo;
	}
	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}
	public String getDescripcionCargo() {
		return descripcionCargo;
	}
	public void setDescripcionCargo(String descripcionCargo) {
		this.descripcionCargo = descripcionCargo;
	}
	public Date getInicioFecha() {
		return inicioFecha;
	}
	public void setInicioFecha(Date inicioFecha) {
		this.inicioFecha = inicioFecha;
	}
	public Date getFinFecha() {
		return finFecha;
	}
	public void setFinFecha(Date finFecha) {
		this.finFecha = finFecha;
	}
	
	
	

}
