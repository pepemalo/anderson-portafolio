package com.learning.springboot.web.app.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.learning.springboot.web.app.models.CargoExperiencia;
import com.learning.springboot.web.app.models.ExperecienciaEmpresa;

@Controller
/* @RequestMapping("/ac")*/ 
public class ExperienciaController {
	
	//Metodo sobre inyeccion de dependencia
	@Autowired
	private ExperecienciaEmpresa expeEmpre; /*= new ExperecienciaEmpresa();*/
	private CargoExperiencia cargoEmpre; /*= new CargoExperiencia();*/

	@SuppressWarnings("unused")
	@GetMapping("experiencia")
	public String experiencia(Model modal) throws ParseException {

		/*
		 * Creacion de Objetos y Variables
		 * 
		 */	
		String fechaInicialStr = "22/01/2023"; // Asigna la fecha inicial como una cadena en el formato "dd/MM/yyyy"
		String fechaFinStr = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String mensajeDescripcion = "";
		ArrayList lista = null;
		ExperecienciaEmpresa expeEmpre = new ExperecienciaEmpresa();
		CargoExperiencia cargoEmpre= new CargoExperiencia();

		try {
			
		    // Parsea las cadenas de fecha a objetos Date
		    Date fechaInicial = sdf.parse(fechaInicialStr);
		    Date fechaFin = new Date(); // Fecha actual
			
			mensajeDescripcion = "Como Analista de Desarrollo de Software en la Universidad de Pamplona, asumo la responsabilidad de brindar soporte continuo y crear nuevas funcionalidades para la plataforma educativa Suite Academusoft. Mi conjunto de habilidades incluye dominio en Java, JSP, HTML, CSS y SQL, los cuales empleo para enriquecer la experiencia del usuario y garantizar el correcto funcionamiento de la plataforma.\r\n"
					+ "\r\n"
					+ "Desde mi incorporación al equipo, he colaborado en diversos proyectos que han resultado en mejoras significativas en el rendimiento y la calidad de la plataforma. Mi pasión por la educación se refleja en mi firme creencia en el potencial transformador de la tecnología en la vida de los estudiantes.";

			if (expeEmpre != null && cargoEmpre != null) {

				// Setteo a la Empresa CIADTI
				expeEmpre.setPais("Colombia");
				expeEmpre.setDepartamento("Norte de Santander");
				expeEmpre.setCiudad("Pamplona");
				expeEmpre.setDireccion("Cl. 5 #3-93");
				expeEmpre.setNombreEmpresa(
						"CENTRO DE INVESTIGACIÓN APLICADA Y\r\n" + "\r\n" + "DESARROLLO DE TECNOLOGÍAS DE INFORMACIÓN");
				expeEmpre.setDescripcion(
						"El centro de Investigacion Aplicada y Desarrollo en tecnologias de Informacion - CIADTI, de la Universidad de Pamplona, destinado a la implementacion y aplicacion"
								+ " de las tecnologias de informacion y Comunicacion - TIC, busca optimizar los proceso a trtaves de soluciones integrales de calidad...");
				expeEmpre.setTelefonoContacto("Tel: (607) 5686367");
				//cargoEmpre.setInicioFecha(fechaFin);
				// Segundo objeto
				cargoEmpre.setDescripcionCargo(
						"Como Analista de Desarrollo de Software en la Universidad de Pamplona, \r\n"
								+ "asumo la responsabilidad de brindar soporte continuo y crear nuevas funcionalidades para la plataforma educativa Suite Academusoft. \r\n"
								+ "Mi conjunto de habilidades incluye dominio en Java, JSP, HTML, CSS y SQL, los cuales empleo para enriquecer \r\n"
								+ "la experiencia del usuario y garantizar el correcto funcionamiento de la plataforma.\r\n"
								+ "\r\n"
								+ "Desde mi incorporación al equipo, he colaborado en diversos proyectos que han resultado en mejoras \r\n"
								+ "significativas en el rendimiento y la calidad de la plataforma. Mi pasión por la educación se refleja en mi firme creencia \r\n"
								+ "en el potencial transformador de la tecnología en la vida de los estudiantes");
				cargoEmpre.setNombreCargo("Analista de Desarrollo de Software");
				//Apartado de Setteo de Fechas
			    cargoEmpre.setInicioFecha(fechaInicial);
			    cargoEmpre.setFinFecha(fechaFin);
				
				//cargoEmpre.setFinFecha(new Date());
				
				/* modal.addAttribute("fechaIni", sdf.parse(fechaInicial)); */
				modal.addAttribute("cargo", cargoEmpre);
				modal.addAttribute("empresa", expeEmpre);

//				lista.add(cargoEmpre);
			}

		} catch (Exception e) {
			System.out.println(" class : experienciaController.java method : experiencia " + e.getMessage());
			// TODO: handle exception
		}

		return "experiencia";
	}

}
