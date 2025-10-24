# PayGenius - Spring Boot Expense Tracker API 💰

A robust, secure, and production-ready backend service for a personal finance application, meticulously crafted with **Java 17** and the **Spring Boot** framework.

This project showcases a scalable, multi-layered architecture and embodies modern Java development practices. It delivers a comprehensive RESTful API for managing personal expenses, prioritizing clean code, clear separation of concerns, and robust security.

---

## ✨ Project Highlights

-   **Full CRUD Functionality:** Provides a complete set of API endpoints for **C**reating, **R**eading, **U**pdating, and **D**eleting expense records.
-   **Data Integrity:** Implements server-side data validation using `jakarta.validation` to ensure all expense data is accurate and consistent.
-   **Robust Security:** Leverages **Spring Security** with a custom configuration (`SecurityConfig.java`) to define and enforce API access rules, demonstrating a best-practice approach to securing RESTful services.
-   **Clean Architecture:** Built on a classic 3-tier architecture (Controller, Service, Repository) for enhanced modularity, maintainability, and scalability.
-   **Database Integration:** Seamlessly connects to a **MySQL 8.x** database using **Spring Data JPA** and Hibernate for efficient and reliable data persistence.

---

## 🚀 Technical Architecture

This API adheres to a standard 3-tier architecture, widely recognized in the industry for developing scalable and maintainable enterprise applications.
---

## 🛠️ Technologies & Tools Used

-   **Backend Framework:** Spring Boot 3.2.5
-   **Programming Language:** Java 17
-   **API Security:** Spring Security 6.x
-   **ORM / Persistence:** Spring Data JPA, Hibernate
-   **Relational Database:** MySQL 8.x
-   **Build Tool:** Apache Maven
-   **API Testing:** Postman

---

## 🌐 API Endpoints

The API provides a comprehensive set of RESTful endpoints. Use Postman (or any other API client) for testing.

**Base URL:** `http://localhost:8080/api/expenses`

| Method | Endpoint | Description | Request Body Example |
| :----- | :------- | :---------- | :------------------- |
| `POST` | `/` | Creates a new expense record. | `{"description":"Dinner with friends","amount":45.75,"category":"Social","date":"2025-10-20"}` |
| `GET` | `/` | Retrieves a list of all recorded expenses. | `N/A` |
| `GET` | `/{id}` | Fetches a single expense by its unique `id`. | `N/A` |
| `PUT` | `/{id}` | Updates an existing expense identified by `id`. | `{"description":"Updated dinner cost","amount":50.00,"category":"Social","date":"2025-10-20"}` |
| `DELETE`| `/{id}` | Deletes an expense record by its unique `id`. | `N/A` |

---

## 🔒 Security Configuration

The `SecurityConfig.java` class outlines the security posture for the API:

-   **CSRF Protection:** Explicitly disabled, as it is generally not required for stateless REST APIs that rely on token-based authentication (though not implemented in this version, it's a common pattern for future integration).
-   **Public API Access:** All routes under the `/api/expenses/**` path are configured with `.permitAll()`, allowing unauthenticated access for client applications.
-   **Default Security:** Any other un-matched requests or endpoints remain secured by Spring Security's default authentication mechanisms.

This configuration demonstrates an understanding of fundamental API security principles and how to tailor them for specific application needs.

---

## 🏁 Getting Started

Follow these steps to set up and run the PayGenius API on your local machine.

### Prerequisites

-   **Java Development Kit (JDK) 17** or newer
-   **Apache Maven** (for dependency management and build automation)
-   A running instance of a **MySQL 8.x** database server

### Local Development Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/](https://github.com/)[YOUR_GITHUB_USERNAME]/paygenius-expense-tracker-api.git
    cd paygenius-expense-tracker-api
    ```

2.  **Set up the MySQL Database:**
    -   Access your MySQL server (e.g., via MySQL Workbench, command line).
    -   Execute the following SQL command to create the database:
        ```sql
        CREATE DATABASE paygenius_db;
        ```

3.  **Configure Database Connection:**
    -   Open `src/main/resources/application.properties`.
    -   Update the following lines with your specific MySQL username and password:
        ```properties
        spring.datasource.username=your_mysql_username
        spring.datasource.password=your_mysql_password
        ```

4.  **Build and Run the Application:**
    -   Open the project in your preferred IDE (e.g., IntelliJ IDEA).
    -   Ensure Maven dependencies are loaded (IDE usually prompts for this, or manually 'Reload Maven Project').
    -   Run the `PaygeniusApplication.java` file.
    -   The application will start on `http://localhost:8080`.

---

## 📄 License

Distributed under the **MIT License**. See the `LICENSE` file in the repository for full details.

---

## 📞 Contact
Swapnil Panda/Linkedin : www.linkedin.com/in/swapnil-panda-1207992ba
