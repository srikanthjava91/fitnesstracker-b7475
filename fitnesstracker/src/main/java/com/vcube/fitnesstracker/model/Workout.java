package com.vcube.fitnesstracker.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Workout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String userName;
	private String workoutType;
	private String exerciseName;
	private Integer duration;
	private Double caloriesBurned;
	private LocalDate workoutDate;
	private String intensity;
	private String trainerName;
	private String status;

}
