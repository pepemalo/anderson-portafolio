package com.learning.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class HomeController {
	
	private Date startTime;
	
    @Value("${spring.application.name}")
    private String applicationName;

	@GetMapping("/")
	public String home() {
		System.out.println("##############################");
		System.out.println("####    	INICIO    ####");
		this.init();
		System.out.println("##############################");
		return "redirect:/ac/index";
	}

	public String getErrorPath() {
		return "/error";
	}

	@GetMapping("/error")
	public String handleError(HttpServletRequest request) {

	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("errorMsg", "La página que buscas no se encontró.");
	    modelAndView.addObject("statusCode", "404");
	    modelAndView.setViewName("error");

	    return "error";
	}
	
	 @PostConstruct
	    public void init() {
	        startTime = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        System.out.println("Aplicación '" + applicationName + "' iniciada en: " + sdf.format(startTime));
	    }

}
