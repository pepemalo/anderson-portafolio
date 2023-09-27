package com.learning.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServlet;

@Controller
@RequestMapping("/ac")
public class ErrorController {
	
	 public String getErrorPath() {
	        return "/error";
	    }
	 
	    @RequestMapping("/error")
	    public String handleError(Model model, HttpServlet request) {
	        // Puedes agregar lógica personalizada de manejo de errores aquí y devolver una vista apropiada
	        return "error"; // Crea una plantilla "error.html" o "error.jsp" para mostrar la página de error
	    }
}
