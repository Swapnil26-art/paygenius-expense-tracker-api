💸 PayGenius: Spring Boot Expense Tracker API

<p align="center">
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Java-17-007396%3Fstyle%3Dfor-the-badge%26logo%3Djava" alt="Java 17" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Spring_Boot-3.2.5-6DB33F%3Fstyle%3Dfor-the-badge%26logo%3Dspringboot" alt="Spring Boot" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Spring_Security-6.x-6DB33F%3Fstyle%3Dfor-the-badge%26logo%3Dspringsecurity" alt="Spring Security" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/MySQL-8.x-4479A1%3Fstyle%3Dfor-the-badge%26logo%3Dmysql" alt="MySQL" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/JWT-Authentication-black%3Fstyle%3Dfor-the-badge%26logo%3Djsonwebtokens" alt="JWT Ready" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/License-MIT-yellow.svg%3Fstyle%3Dfor-the-badge" alt="License: MIT" />
</p>

PayGenius is a secure, scalable, and production-ready RESTful API for a modern personal expense tracking application. Meticulously crafted with Java 17 and the Spring Boot framework, this project demonstrates a deep understanding of enterprise-level backend development, clean architecture, and API security.

✨ Project Overview

This API serves as the central backend for the PayGenius application, delivering a complete and robust set of endpoints to manage personal finances. It is built on a classic 3-tier architecture (Controller, Service, Repository) to ensure a clean separation of concerns, high maintainability, and effortless scalability.

🚀 Key Features

Enterprise-Grade Security: Leverages Spring Security with a custom SecurityConfig to define and enforce fine-grained API access rules. The project is "JWT-ready" with the necessary dependencies (jjwt-api, jjwt-impl) for easy integration of stateless token-based authentication.

Full CRUD Functionality: Provides a complete and comprehensive set of API endpoints for Creating, Reading, Updating, and Deleting (CRUD) expense records.

High-Performance Data Access: Utilizes Spring Data JPA and Hibernate for efficient, high-performance object-relational mapping (ORM) to a MySQL 8.x database, abstracting away complex SQL.

Clean & Maintainable Code: Adheres strictly to the 3-tier architectural pattern, ensuring that business logic, data access, and API routing are completely decoupled.

🛠️ Tech Stack & Tools

Backend Framework: Spring Boot 3.2.5

Programming Language: Java 17

API Security: Spring Security 6.x

ORM / Persistence: Spring Data JPA, Hibernate

Relational Database: MySQL 8.x

Authentication: JWT (Dependencies included)

Build Tool: Apache Maven

API Testing: Postman

🏗️ Architectural Design (3-Tier)

The API's architecture is a cornerstone of its design, promoting robustness and separation of concerns.

+---------------------+           +--------------------------+
|  Client (Postman)   |<--------->| 1. Controller Layer      |
| (Interacts with API)|           |   (ExpenseController.java) |
+---------------------+           +--------------------------+
          |                             - Handles all HTTP requests (GET, POST, PUT, DELETE).
          |                             - Maps API endpoints to service methods.
          |                             - Manages API request/response formats.
          v                                        |
+---------------------+                            v
| 2. Service Layer    |<-----------------------+--------------------------+
| (ExpenseService.java)|                         | 3. Repository Layer      |
+---------------------+                         |   (ExpenseRepository.java) |
          |                                     +--------------------------+
          | - Contains all core business logic.   - Abstracts all database interactions.
          | - Manages transactions.               - Built with Spring Data JPA interfaces.
          | - Decouples controllers from data.               |
          v                                                  v
+---------------------+
|  MySQL Database     |
| (Data Persistence)  |
+---------------------+


🌐 API Endpoint Documentation

A complete set of RESTful endpoints for managing expenses.

Base URL: http://localhost:8080/api/expenses

Method

Endpoint

Description

Request Body Example

POST

/

Create a new expense record.

{"description":"Dinner","amount":45.75,"category":"Social","date":"2025-10-20"}

GET

/

Get all expenses in the system.

N/A

GET

/{id}

Get a single expense by its unique id.

N/A

PUT

/{id}

Update an existing expense by id.

{"description":"Updated dinner","amount":50.00,"category":"Social","date":"2025-10-20"}

DELETE

/{id}

Delete an expense by its unique id.

N/A

🔒 Security Configuration

The SecurityConfig.java class outlines the security posture for the API:

CSRF Protection: Explicitly disabled (.csrf(AbstractHttpConfigurer::disable)), a standard practice for stateless REST APIs that are not vulnerable to cross-site request forgery.

Public API Access: All routes under the /api/expenses/** path are configured with .permitAll(), allowing unauthenticated access for client applications during development. This can be easily toggled to .authenticated() to secure all endpoints.

Default Security: Any other un-matched requests or endpoints remain secured by Spring Security's default mechanisms.

🌟 Future Enhancements (Roadmap)

This project provides a solid foundation for several advanced features:

Full JWT Authentication: Implement user registration and login endpoints that return a JSON Web Token (JWT) for securing all other API endpoints.

User-Specific Data: Link expenses to a specific User entity to create a true multi-tenant application where users can only see their own financial data.

Advanced Reporting: Add new endpoints for generating financial summaries, such as /api/expenses/summary/monthly or /api/expenses/summary/category.

Unit & Integration Testing: Build a comprehensive test suite using JUnit and Mockito to achieve high test coverage and ensure application reliability.

🏁 Getting Started

Follow these steps to set up and run the PayGenius API on your local machine.

Prerequisites

Java Development Kit (JDK) 17 or newer

Apache Maven

A running instance of a MySQL 8.x database server

Local Development Setup

Clone the Repository

git clone [https://github.com/Swapnil26-art/paygenius-expense-tracker-api.git](https://github.com/Swapnil26-art/paygenius-expense-tracker-api.git)
cd paygenius-expense-tracker-api


Create the MySQL Database

Access your MySQL server (e.g., via MySQL Workbench, command line).

Execute the following SQL command:

CREATE DATABASE paygenius_db;


Configure Database Connection

Open src/main/resources/application.properties.

Update the following lines with your specific MySQL root username and password:

spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password


Build and Run the Application

Open the project in your preferred IDE (e.g., IntelliJ IDEA).

Wait for Maven to download all dependencies.

Run the PaygeniusApplication.java file.

The API server will start on http://localhost:8080.

📄 License

Distributed under the MIT License. See the LICENSE file for more information.

📞 Contact

Swapnil Panda/Linkedin : www.linkedin.com/in/swapnil-panda-1207992ba
