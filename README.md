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
```
hospital-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── hospitalapp/
│   │   │               ├── config/
│   │   │               │   ├── AppConfig.java
│   │   │               │   ├── logging/
│   │   │               │   │   ├── LogStrategy.java
│   │   │               │   │   ├── Slf4jLogStrategy.java
│   │   │               │   │   └── LogContext.java
│   │   │               │   └── datasource/
│   │   │               │       ├── DataSourceFactory.java
│   │   │               │       ├── HikariDataSourceFactory.java
│   │   │               │       └── JdbcTransactionManager.java
│   │   │               │
│   │   │               ├── patient/
│   │   │               │   ├── controller/
│   │   │               │   │   ├── PatientController.java
│   │   │               │   │   └── PatientControllerImpl.java
│   │   │               │   ├── service/
│   │   │               │   │   ├── PatientService.java
│   │   │               │   │   └── PatientServiceImpl.java
│   │   │               │   ├── repository/
│   │   │               │   │   ├── PatientRepository.java
│   │   │               │   │   └── PatientRepositoryJdbcImpl.java
│   │   │               │   ├── dto/
│   │   │               │   │   ├── PatientRequest.java
│   │   │               │   │   └── PatientResponse.java
│   │   │               │   ├── mapper/
│   │   │               │   │   ├── PatientMapper.java
│   │   │               │   │   └── PatientMapperImpl.java
│   │   │               │   ├── exception/
│   │   │               │   │   └── PatientNotFoundException.java
│   │   │               │   └── entity/
│   │   │               │       └── Patient.java
│   │   │               │
│   │   │               ├── doctor/
│   │   │               │   ├── controller/
│   │   │               │   │   ├── DoctorController.java
│   │   │               │   │   └── DoctorControllerImpl.java
│   │   │               │   ├── service/
│   │   │               │   │   ├── DoctorService.java
│   │   │               │   │   └── DoctorServiceImpl.java
│   │   │               │   ├── repository/
│   │   │               │   │   ├── DoctorRepository.java
│   │   │               │   │   └── DoctorRepositoryJdbcImpl.java
│   │   │               │   ├── dto/
│   │   │               │   │   ├── DoctorRequest.java
│   │   │               │   │   └── DoctorResponse.java
│   │   │               │   ├── mapper/
│   │   │               │   │   ├── DoctorMapper.java
│   │   │               │   │   └── DoctorMapperImpl.java
│   │   │               │   ├── exception/
│   │   │               │   │   └── DoctorNotFoundException.java
│   │   │               │   └── entity/
│   │   │               │       └── Doctor.java
│   │   │               │
│   │   │               ├── appointment/
│   │   │               │   ├── controller/
│   │   │               │   │   ├── AppointmentController.java
│   │   │               │   │   └── AppointmentControllerImpl.java
│   │   │               │   ├── service/
│   │   │               │   │   ├── AppointmentService.java
│   │   │               │   │   └── AppointmentServiceImpl.java
│   │   │               │   ├── repository/
│   │   │               │   │   ├── AppointmentRepository.java
│   │   │               │   │   └── AppointmentRepositoryJdbcImpl.java
│   │   │               │   ├── dto/
│   │   │               │   │   ├── AppointmentRequest.java
│   │   │               │   │   └── AppointmentResponse.java
│   │   │               │   ├── mapper/
│   │   │               │   │   ├── AppointmentMapper.java
│   │   │               │   │   └── AppointmentMapperImpl.java
│   │   │               │   ├── exception/
│   │   │               │   │   └── AppointmentNotFoundException.java
│   │   │               │   └── entity/
│   │   │               │       └── Appointment.java
│   │   │               │
│   │   │               ├── common/
│   │   │               │   ├── base/
│   │   │               │   │   ├── BaseDto.java
│   │   │               │   │   ├── BaseController.java
│   │   │               │   │   ├── BaseService.java
│   │   │               │   │   ├── BaseRepository.java
│   │   │               │   │   └── BaseMapper.java
│   │   │               │   ├── exception/
│   │   │               │   │   ├── BaseException.java
│   │   │               │   │   ├── RepositoryException.java
│   │   │               │   │   └── DataAccessException.java
│   │   │               │   ├── model/
│   │   │               │   │   └── enums/
│   │   │               │   │       ├── AppointmentStatus.java
│   │   │               │   │       ├── Gender.java
│   │   │               │   │       └── UserStatus.java
│   │   │               │   ├── factory/
│   │   │               │   │   ├── ValidatorFactory.java
│   │   │               │   │   ├── ConverterFactory.java
│   │   │               │   │   └── MapperFactory.java
│   │   │               │   ├── dto/
│   │   │               │   │   └── ErrorResponse.java
│   │   │               │   └── util/
│   │   │               │       ├── Constants.java
│   │   │               │       ├── converter/
│   │   │               │       │   └── DateConverter.java
│   │   │               │       └── validation/
│   │   │               │           ├── ValidationUtils.java
│   │   │               │           └── ValidatorContext.java
│   │   │               │
│   │   │               └── main/
│   │   │                   └── console/
│   │   │                       └── MainConsoleApplication.java
│   │
│   └── resources/
│       └── application.properties
│
├── src/test/java/com/example/hospitalapp/
│   ├── patient/
│   │   └── PatientServiceTest.java
│   ├── doctor/
│   │   └── DoctorServiceTest.java
│   ├── appointment/
│   │   └── AppointmentServiceTest.java
│   └── common/
│       └── util/
│           └── DateConverterTest.java
│
└── pom.xml

```
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
