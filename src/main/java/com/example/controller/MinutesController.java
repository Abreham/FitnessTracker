package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.modle.Activity;
import com.example.modle.Exercise;
import com.example.service.ExerciseService;

@Controller
public class MinutesController {
	
	private static final String DEFAULT_VIEW = "addMinutes";
	private ExerciseService exerciseService;
	
	@RequestMapping(value="/addMinutes",method=RequestMethod.POST)
	public String addMinutes(@Valid @ModelAttribute("exercise") Exercise exercise,BindingResult result){
				
		if(result.hasErrors()){
			System.out.println("please place proper selection: " + exercise.getMinutes() + " Type: " + exercise.getActivity());	
		}else{
			
			System.out.println("exercise: " + exercise.getMinutes());		
			System.out.println("exercise type: " + exercise.getActivity() + ": " + exercise.getMinutes());	
		}
		
		return DEFAULT_VIEW;
	}
	
	@RequestMapping(value="/addMinutes", method=RequestMethod.GET)
	public String addMinutes(Model model){
		Exercise exercise = new Exercise();
		exercise.setActivity("Run");
		exercise.setMinutes(5);
		
		model.addAttribute("exercise",exercise);
		return DEFAULT_VIEW;	
	}
	
	
	@RequestMapping(value="/activities",method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
       return exerciseService.findAllActivities();
	}

	@Autowired
	public void setService(ExerciseService service) {
		this.exerciseService = service;
	}
	
}
