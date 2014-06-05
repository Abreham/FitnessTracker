package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.modle.Exercise;

@Controller
public class MinutesController {
	
	private static final String DEFAULT_VIEW = "addMinutes";
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("exercise: " + exercise.getMinutes());
		return DEFAULT_VIEW;
	}
}
