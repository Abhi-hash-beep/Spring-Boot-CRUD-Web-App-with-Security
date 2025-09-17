Spring Boot CRUD Web App with Security & Dynamic Frontend
<p align="center">
<img src="https://img.shields.io/badge/status-maintained-green" alt="Status" />
<img src="https://img.shields.io/badge/license-MIT-blue" alt="License" />
<img src="https://img.shields.io/badge/Java-17+-orange" alt="Java Version" />
<img src="https://img.shields.io/badge/Spring_Boot-3.x-brightgreen" alt="Spring Boot Version" />
</p>

A full-stack web application built with Spring Boot that demonstrates a complete C.R.U.D. (Create, Read, Update, Delete) system with a robust security layer and a modern, dynamic frontend. The project manages a simple inventory of products, but its core focus is on showcasing secure authentication and role-based authorization in a real-world context.

The application features a custom-styled user interface built with internal CSS and JavaScript, offering a clean, responsive, and engaging user experience. It differentiates between guest users (read-only access) and authenticated users (full CRUD privileges).

## 📋 Table of Contents
Key Features

Screenshots

Project Architecture

Key URL Endpoints

Tech Stack

Getting Started

How to Contribute

License

Contact

## ✨ Key Features
Full CRUD Functionality: Complete functionality to Create, Read, Update, and Delete products.

Secure Authentication: User registration and login system powered by Spring Security.

Password Encryption: All user passwords are securely hashed using BCrypt.

Role-Based Authorization:

Guests (Anonymous Users): Can only view the list of products.

Authenticated Users: Have full permissions to add, edit, and delete products.

Dynamic UI with Thymeleaf: The interface dynamically renders content based on the user's authentication status using thymeleaf-extras-springsecurity6.

Modern Frontend:

Custom, responsive pages with gradient backgrounds and "glassmorphism" card styles.

Interactive hover effects on buttons and form inputs.

Password visibility toggle on login and registration forms.

Client-side validation to confirm password matching on the registration page.

A custom, non-blocking modal for delete confirmations.

## 📸 Screenshots

Login Page
<img width="1919" height="1070" alt="Screenshot 2025-09-17 191633" src="https://github.com/user-attachments/assets/16366124-25c8-4ca1-8f6e-a066a47f1db1" />
Product List 
<img width="1919" height="1069" alt="Screenshot 2025-09-17 191549" src="https://github.com/user-attachments/assets/57d39ed5-428b-4c9d-a7a9-79c49ff8bc58" />
Add and Edit Product page
<img width="1919" height="1073" alt="Screenshot 2025-09-17 191653" src="https://github.com/user-attachments/assets/85fa46f5-bbdc-4f53-b9b8-1cdf169b8e6b" />
Registration Page
<img width="1919" height="1073" alt="image" src="https://github.com/user-attachments/assets/71d45333-96ad-42f5-b2b5-5a15a5debd68" />

## 🏛️ Project Architecture
This project follows a standard layered architecture pattern, promoting separation of concerns and maintainability.

Controller Layer (@Controller): Handles incoming HTTP requests, processes user input, and maps requests to the appropriate view or service method.

Service Layer (@Service): Contains the core business logic of the application. It acts as an intermediary between the Controller and Repository layers.

Repository Layer (@Repository): Manages data persistence using the Spring Data JPA repository pattern. It provides an abstraction over the database.

Entity/Model Layer (@Entity): Defines the Plain Old Java Objects (POJOs) that are mapped to database tables.

Security Layer (@Configuration, @EnableWebSecurity): Manages all aspects of security, including authentication, authorization, password encoding, and web security rules.

## 🌐 Key URL Endpoints
Method	Endpoint	Description	Access
GET	/products	Displays the list of all products.	Public
GET	/login	Displays the login page.	Public
GET	/register	Displays the user registration page.	Public
POST	/saveUser	Processes the new user registration.	Public
GET	/new	Displays the form to add a new product.	Authenticated
GET	/edit/{id}	Displays the form to edit an existing product.	Authenticated
POST	/save	Saves a new or updated product.	Authenticated
GET	/delete/{id}	Deletes a product by its ID.	Authenticated


## 🛠️ Tech Stack
Backend: Java 17, Spring Boot 3, Spring MVC, Spring Security 6, Spring Data JPA, Hibernate

Frontend: Thymeleaf, HTML5, CSS3, JavaScript

Database: MySQL

Build Tool: Maven

## 🚀 Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites
Make sure you have the following software installed:

Java Development Kit (JDK 17 or later)

Apache Maven

MySQL Server

Git
