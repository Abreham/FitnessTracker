package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.modle.Activity;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();

		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		Activity jump = new Activity();
		jump.setDesc("Jump");
		activities.add(jump);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);

		return activities;

	}

}
