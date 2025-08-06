package org.example.common.util;

import java.time.format.DateTimeFormatter;

public class Constants {

    private Constants() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // Date and Time Formats
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_FORMAT = "HH:mm";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);

    // Validation Patterns
    public static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public static final String PHONE_PATTERN = "^[0-9]{10}$";
    public static final String NATIONAL_ID_PATTERN = "^[0-9]{11}$";
    public static final String NAME_PATTERN = "^[A-Za-zÇçĞğıİÖöŞşÜü\\s]{2,50}$";
    public static final String ROOM_NUMBER_PATTERN = "^[A-Z0-9]{1,10}$";

    // Length Constraints
    public static final int MIN_NAME_LENGTH = 2;
    public static final int MAX_NAME_LENGTH = 50;
    public static final int MAX_EMAIL_LENGTH = 100;
    public static final int MAX_PHONE_LENGTH = 10;
    public static final int NATIONAL_ID_LENGTH = 11;
    public static final int MAX_ADDRESS_LENGTH = 500;
    public static final int MAX_NOTES_LENGTH = 1000;
    public static final int MAX_ROOM_NUMBER_LENGTH = 10;

    // Business Rules
    public static final int MIN_APPOINTMENT_HOUR = 8;  // 08:00
    public static final int MAX_APPOINTMENT_HOUR = 18; // 18:00
    public static final int APPOINTMENT_DURATION_MINUTES = 30;
    public static final int MIN_AGE_FOR_APPOINTMENT = 0;
    public static final int MAX_AGE_FOR_APPOINTMENT = 120;

    // Database Configuration
    public static final String DB_DRIVER = "org.postgresql.Driver";
    public static final int CONNECTION_POOL_MIN_SIZE = 5;
    public static final int CONNECTION_POOL_MAX_SIZE = 20;
    public static final int CONNECTION_TIMEOUT_MS = 30000;
    public static final int IDLE_TIMEOUT_MS = 600000;

    public static final class ErrorMessages {
        public static final String INVALID_EMAIL = "Invalid email format";
        public static final String INVALID_PHONE = "Phone number must be 10 digits";
        public static final String INVALID_NATIONAL_ID = "National ID must be 11 digits";
        public static final String INVALID_NAME = "Name must be between 2-50 characters and contain only letters";
        public static final String PATIENT_NOT_FOUND = "Patient not found with ID: ";
        public static final String DOCTOR_NOT_FOUND = "Doctor not found with ID: ";
        public static final String APPOINTMENT_NOT_FOUND = "Appointment not found with ID: ";
        public static final String NATIONAL_ID_ALREADY_EXISTS = "National ID already exists: ";
        public static final String INVALID_APPOINTMENT_TIME = "Appointment time must be between 08:00-18:00";
        public static final String APPOINTMENT_CONFLICT = "Doctor has conflicting appointment at this time";
        public static final String INVALID_DATE_RANGE = "Start date cannot be after end date";
        public static final String PAST_APPOINTMENT_DATE = "Cannot book appointment in the past";
    }

    public static final class SuccessMessages {
        public static final String PATIENT_CREATED = "Patient created successfully";
        public static final String PATIENT_UPDATED = "Patient updated successfully";
        public static final String PATIENT_DELETED = "Patient deleted successfully";
        public static final String DOCTOR_CREATED = "Doctor created successfully";
        public static final String DOCTOR_UPDATED = "Doctor updated successfully";
        public static final String DOCTOR_DELETED = "Doctor deleted successfully";
        public static final String APPOINTMENT_CREATED = "Appointment created successfully";
        public static final String APPOINTMENT_UPDATED = "Appointment updated successfully";
        public static final String APPOINTMENT_CANCELLED = "Appointment cancelled successfully";
        public static final String APPOINTMENT_CONFIRMED = "Appointment confirmed successfully";
        public static final String APPOINTMENT_COMPLETED = "Appointment completed successfully";
    }

    public static final class Queries {
        public static final String SELECT_ALL = "SELECT * FROM %s WHERE is_active = true";
        public static final String SELECT_BY_ID = "SELECT * FROM %s WHERE id = ? AND is_active = true";
        public static final String SOFT_DELETE = "UPDATE %s SET is_active = false WHERE id = ?";
        public static final String COUNT_BY_FIELD = "SELECT COUNT(*) FROM %s WHERE %s = ? AND is_active = true";
    }
}
