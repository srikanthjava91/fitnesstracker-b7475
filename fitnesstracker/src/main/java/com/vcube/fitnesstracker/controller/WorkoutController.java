package com.vcube.fitnesstracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.fitnesstracker.model.Workout;
import com.vcube.fitnesstracker.repo.WorkoutRepo;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

	@Autowired
	WorkoutRepo workoutRepo;

	@PostMapping("/create")
	Workout createData(@RequestBody Workout workout) {
		return workoutRepo.save(workout);
	}

	@GetMapping("getAllWorkouts")
	List<Workout> getAllUserDetails() {
		return workoutRepo.findAll();
	}

	// http://localhost:8877/workout/getWorkout/1
	@GetMapping("getWorkout/{id}")
	Workout getUserDetailsById(@PathVariable Integer id) {
		return workoutRepo.findById(id).get();
	}

	@PutMapping("update/{id}")
	Workout upDateWorkOuDetails(@RequestBody Workout w, @PathVariable Integer id) {
		Workout user = getUserDetailsById(id);
		user.setCaloriesBurned(w.getCaloriesBurned());
		user.setDuration(w.getDuration());
		user.setExerciseName(w.getExerciseName());
		return workoutRepo.save(user);
	}

	@DeleteMapping("delete/{id}")
	String deleteWorkoutInfo(@PathVariable Integer id) {
		workoutRepo.deleteById(id);
		return "Deleted Successfully";
	}

}
