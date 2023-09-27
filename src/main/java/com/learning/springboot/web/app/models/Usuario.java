package com.learning.springboot.web.app.models;

import org.springframework.stereotype.Component;

//Necesario para aplicar la inyeccion
@Component
public class Usuario {

	
	private String  nombre = "";
	private String apellidoPaterno = "";
	private String apellidoMaterno = "";
	private String birthday = "";
	private String celular = "";
	private String email =  "";
	private String correo = "";
	
	private int edad = 0;
	
	//Creacion de  Constructores


	
	public Usuario() {
	}

	public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String birthday, String celular,
			String email, String correo, int edad) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.birthday = birthday;
		this.celular = celular;
		this.email = email;
		this.correo = correo;
		this.edad = edad;
	}

	//Creacion de Settersy Getters
	
	
	
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	
}
