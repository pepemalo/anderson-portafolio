package com.learning.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/ac")
public class IndexController {
	
	@Value("${texto.indexController.index.titulo}")
	private String tituloCabecera;
	
	@Value("${texto.indexController.index.java}")
	private String java;
	
	@Value("${texto.indexController.index.jscript}")
	private String jscript;
	
	@Value("${texto.indexController.index.jsp}")
	private String jsp;
	
	@Value("${texto.indexController.index.oracle}")
	private String oracle;
	
	@Value("${texto.indexController.index.html}")
	private String html;
	
	@Autowired
	private Usuario user; /* = new Usuario();*/
	
	@GetMapping({ "/index"})
	public String index(Model model) {

		/*
		 * Creacion de Variables e Instancias
		 */

		try {
			model.addAttribute("title",tituloCabecera );
			model.addAttribute("about", "Acerca de Anderson Cardozo");
			model.addAttribute("yoSoy", "Mi Nombre es Anderson Cardozo Arrieta, Ing de Sistemas en Formación.");
			model.addAttribute("sobreMi",
					"Soy un Tecnólogo en Gestión de Redes y Sistemas Teleinformáticos, un apasionado desarrollador con un sólido compromiso hacia la innovación y el aprendizaje continuo. En este momento, estoy aplicando mis conocimientos en mi rol como Analista de Desarrollo de Software en la Universidad de Pamplona. Aprovecho esta oportunidad para ampliar y fortalecer mis habilidades. Simultáneamente, estoy avanzando en mi carrera profesional en Ingeniería de Sistemas, con el propósito de enriquecer mi experiencia y conocimientos en este campo en constante evolución.");

			// Sector de Habilidades
			model.addAttribute("mySkills", "Mis Habilidades");
			model.addAttribute("desSkills", "Poseo conocimientos y habilidades fundamentales en programación");
			model.addAttribute("java", java);
			model.addAttribute("jscript",  jscript);
			model.addAttribute("jsp",jsp );
			model.addAttribute("oracle", oracle );
			model.addAttribute("html",  html);
			model.addAttribute("css", "CSS");
			model.addAttribute("github", "GitHub");
			model.addAttribute("jira", "Jira");
			model.addAttribute("postman", "Postman");

			// sector de Educacion
			model.addAttribute("estudio", "Educación");

			model.addAttribute("tecnologo", "Tecnólogo en Gestión de Redes y Sistemas Teleinformáticos");
			model.addAttribute("tecnDes",
					"Titulo Obtenido de forma meritoria en Pamplona Norte de Santander en el Instituto Superior de Educacion Rural - ISER.");

			model.addAttribute("ingSistemas", "Ingenieria de Sistemas");
			model.addAttribute("ingDes",
					"Actualmente me encuentro cursando el 3 Semestre con proceso de Homologacion.");

			model.addAttribute("cursoUdemy", "Cursos");
			model.addAttribute("udemyDes", "Conocimientos adquiridos a través del autoestudio en la plataforma Udemy.");

			// sector de Contactos
			model.addAttribute("contactame", "Contactame");
			model.addAttribute("number", "+57 3026904599");
			model.addAttribute("direccion", "Pamplona Norte de Santander, Calle 7 numero 4-30");
			model.addAttribute("email", "andercardozo04@gmail.com");

			// Pagina Experiencia
			model.addAttribute("experience", "Experiencia");
			System.out.println("user "+user);
			if (user != null) {
				user.setNombre("Anderson");
				user.setApellidoPaterno("Cardozo");
				user.setApellidoMaterno("Arrieta");
				user.setEdad(22);
				user.setBirthday("25 Sep 2001");
				user.setCelular("+57 3026904599");
				 user.setEmail("aandercardozo04@gmail.com"); 
				user.setCorreo("andercardozo04@gmail.com");
				model.addAttribute("usuario", user);
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(" class : indexController.java method : index " + e.getMessage());
		}

		return "index";
	}

}
