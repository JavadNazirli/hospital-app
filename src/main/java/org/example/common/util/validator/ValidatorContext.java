package org.example.common.util.validator;

import org.example.common.util.validator.validatorUtils.AppointmentValidationUtils;
import org.example.common.util.validator.validatorUtils.GeneralValidationUtils;
import org.example.common.util.validator.validatorUtils.PersonValidationUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ValidatorContext {
    public boolean validateEmail(String email) {
        return PersonValidationUtils.isValidEmail(email);
    }

    public boolean validatePhone(String phone) {
        return PersonValidationUtils.isValidPhone(phone);
    }

    public boolean validateAzerbaijaniNationalId(String azerbaijaniNationalId) {
        return PersonValidationUtils.isValidAzerbaijaniNationalId(azerbaijaniNationalId);
    }

    public boolean validateName(String name) {
        return PersonValidationUtils.isValidName(name);
    }

    public boolean validateBirthDate(LocalDate birthDate) {
        return PersonValidationUtils.isValidBirthDate(birthDate);
    }

    public boolean validateNullOrEmpty(String str) {
        return GeneralValidationUtils.isNullOrEmpty(str);
    }

    public boolean validateExceedMaxLength(String str, int maxLength) {
        return GeneralValidationUtils.exceedsMaxLength(str, maxLength);
    }

    public boolean validateAge(int age) {
        return GeneralValidationUtils.isValidAge(age);
    }

    public boolean validateRoomNumber(String roomNumber) {
        return AppointmentValidationUtils.isValidRoomNumber(roomNumber);
    }

    public boolean validateAppointmentTime(LocalDateTime appointmentTime) {
        return AppointmentValidationUtils.isValidAppointmentTime(appointmentTime);
    }

}
