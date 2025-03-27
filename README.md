# Spring Boot REST API - Tutorial Implementation

This repository contains a Spring Boot REST API project running locally, based on the tutorial:  
[How to create an REST API in Spring boot using Java](https://www.youtube.com/watch?v=Zo9xQzibp4Y)

## 🚀 Setup Instructions
Follow these steps to set up and run the application:

1. **Create the Project**
   - Use [Spring Initializr](https://start.spring.io/) to generate a **Maven** project.
   - Select the following dependencies:
      - **Spring Web** (for REST API support)

2. **Run the Application**
   - Open the project in **IntelliJ IDEA Community Edition**.
   - Use a **Maven run configuration**:
      - Set the **command** to:
        ```sh
        spring-boot:run
        ```
   - Alternatively, run the project from the terminal:
     ```sh
     mvn spring-boot:run
     ```

## 📡 Sending a Request
To test the API, send a **GET request** to:
```sh
http://localhost:8080/user?id=6
