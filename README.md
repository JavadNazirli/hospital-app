# hospital-app-
# Hospital Management Application (Hospital-App)

## Overview
The Hospital Management Application is a pure Java-based backend project designed to manage hospital-related data, including patients, doctors, and appointments. This project avoids using Spring Framework to focus on foundational Java programming concepts and manual implementation of business logic and data access layers. It utilizes PostgreSQL as the primary data source, ensuring a robust and scalable foundation for future enhancements.

## Project Structure
The application follows a modular and layered architecture to ensure maintainability and scalability:
- **`config`**: Contains database and logging configurations.
- **`controller`**: Manages user interactions (currently console-based).
- **`service`**: Implements business logic for patient, doctor, and appointment management.
- **`repository`**: Defines data access interfaces and PostgreSQL implementations.
- **`dto`**: Handles data transfer objects for requests and responses.
- **`mapper`**: Manages conversions between DTOs and entities.
- **`model`**: Includes entity definitions and enums.
- **`exception`**: Custom exception handling for various use cases.
- **`util`**: Utility classes for validation, conversion, and constants.
- **`main`**: Entry point for the console application.
- **`test`**: Unit tests for core functionalities.

## Features
- **Patient Management**: Add, update, delete, and retrieve patient information.
- **Doctor Management**: Manage doctor details and specialties.
- **Appointment Management**: Schedule, update, and cancel appointments between patients and doctors.
- **PostgreSQL Integration**: Uses JDBC for database operations.
- **Modular Design**: Easily extensible for future features like REST API or additional data sources.

## Prerequisites
- **Java 17**: Required for compilation and execution.
- **PostgreSQL**: Database server for storing application data.
- **Maven**: Build and dependency management tool.
- **Git**: For version control and collaboration.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hospital-app.git
