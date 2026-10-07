# 🏋️ Fitness Workout Tracker

## 📌 Project Overview

Fitness Workout Tracker is a full-stack web application developed to manage and track users' workout activities.

The application allows users to record workout details such as workout type, exercise name, duration, calories burned, workout date, workout intensity, trainer name, and workout status.

The backend is developed using **Spring Boot REST API**, data is stored in **MySQL**, and the frontend can be developed using **React JS**.

---

## 🎯 Project Objective

The main objective of this project is to provide a simple system for maintaining workout records and tracking fitness activities.

The project demonstrates how a frontend application communicates with a Spring Boot REST API and how the API performs CRUD operations using Spring Data JPA and MySQL.

---

## 🛠️ Technologies Used

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* REST API
* Maven

### Database

* MySQL

### Frontend

* React JS
* HTML
* CSS
* JavaScript

### Development Tools

* Eclipse / IntelliJ IDEA
* Visual Studio Code
* MySQL Workbench
* Postman
* Swagger / OpenAPI
* Git & GitHub

---

## 🏗️ Project Architecture

```text
React JS
    |
    | HTTP Request / JSON
    ↓
Spring Boot REST API
    |
    ↓
Controller
    |
    ↓
Service
    |
    ↓
Repository
    |
    ↓
JPA / Hibernate
    |
    ↓
MySQL
```

---

## 📊 Database Design

The project uses a single table called `workouts`.

### workouts

| Column         | Type      | Description                     |
| -------------- | --------- | ------------------------------- |
| id             | Integer   | Primary Key                     |
| userName       | String    | User name                       |
| workoutType    | String    | Type of workout                 |
| exerciseName   | String    | Exercise name                   |
| duration       | Integer   | Workout duration in minutes     |
| caloriesBurned | Double    | Calories burned                 |
| workoutDate    | LocalDate | Workout date                    |
| intensity      | String    | Low / Medium / High             |
| trainerName    | String    | Trainer name                    |
| status         | String    | Completed / Pending / Cancelled |

---

## 🔗 REST API Endpoints

### 1. Create Workout

```http
POST /workout/create
```

Request:

```json
{
    "userName": "Rahul",
    "workoutType": "Gym",
    "exerciseName": "Bench Press",
    "duration": 45,
    "caloriesBurned": 320.5,
    "workoutDate": "2026-10-07",
    "intensity": "High",
    "trainerName": "Suresh",
    "status": "Completed"
}
```

---

### 2. Get Workout By ID

```http
GET /workout/1
```

---

### 3. Get All Workouts

```http
GET /workout/getAll
```

---

### 4. Update Workout

```http
PUT /workout/update/1
```

---

### 5. Delete Workout

```http
DELETE /workout/delete/1
```

---

## 🔎 Additional APIs

The project can also provide search and filtering functionality.

```http
GET /workout/type/Gym
GET /workout/status/Completed
GET /workout/intensity/High
GET /workout/user/Rahul
```

---

## ⚙️ Key Features

* Add new workout records
* View workout details
* View all workouts
* Update workout information
* Delete workout records
* Search workouts
* Filter workouts based on workout type
* Filter workouts based on intensity
* Track workout duration
* Track calories burned
* Track workout status
* RESTful API architecture
* MySQL database integration
* React frontend integration
* Swagger API documentation

---

## 🧪 API Testing

APIs can be tested using:

* Postman
* Swagger UI
* Browser for GET requests
* React frontend

---

## 🚀 How to Run the Project

### Step 1: Clone the Project

```bash
git clone <github-repository-url>
```

### Step 2: Configure MySQL

Create a database:

```sql
CREATE DATABASE fitnessdb;
```

### Step 3: Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fitnessdb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Step 4: Run Spring Boot Application

Run the main class:

```java
@SpringBootApplication
public class FitnessTrackerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FitnessTrackerApplication.class, args);
    }
}
```

### Step 5: Test APIs

Open Postman or Swagger and test the REST endpoints.

---

## 📈 Future Enhancements

The application can be enhanced with:

* JWT authentication
* User registration and login
* Workout dashboard
* Weekly and monthly reports
* Calorie charts
* Pagination and sorting
* Advanced search
* Email notifications
* Docker deployment
* AWS deployment
* Spring Security
* Role-based authorization

---

## 👨‍💻 Learning Outcomes

This project helps developers understand:

* Spring Boot application development
* REST API development
* CRUD operations
* Spring Data JPA
* Hibernate
* MySQL integration
* Entity mapping
* JSON request and response
* Exception handling
* API testing
* React and REST API integration
* Git and GitHub workflow
