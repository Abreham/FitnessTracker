package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	private static final String DEFAULT_VIEW = "hello";

	@RequestMapping(value ="/greeting")
	public String sayHello (Model model) {
		
		model.addAttribute("greeting", "Hello There!");
		
		return DEFAULT_VIEW;
	}
	
	@RequestMapping(value ="/howdi")
	public String sayHowdi (Model model) {
		
		model.addAttribute("greeting", "Hello HOWDI!");
		
		return DEFAULT_VIEW;
	}
	
	
}
