package com.learning.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import jakarta.servlet.http.HttpServlet;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		System.out.println("##############################");
		System.out.println("####    INICIANDOOOOO....####");
		System.out.println("##############################");
		return "redirect:/ac/index";
	}

	/*
	 * public String getErrorPath() { return "/error"; }
	 */

	/*
	 * @GetMapping("/error") public String handleError( HttpServlet request ) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("errorMsg", "La página que buscas no se encontró.");
	 * modelAndView.addObject("statusCode", "404");
	 * modelAndView.setViewName("error");
	 * 
	 * return "error"; }
	 */
}
