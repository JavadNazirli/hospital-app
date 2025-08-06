package org.example.common.util.validator.validatorUtils;

import java.time.LocalDate;
import java.util.regex.Pattern;

public final class PersonValidationUtils {

    private PersonValidationUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    private static final Pattern PHONE_PATTERN = Pattern.compile("^[0-9]{9}$");

    private static final Pattern NATIONAL_ID_PATTERN = Pattern.compile("^[A-Z]{2}[0-9]{7}$");

    private static final Pattern NAME_PATTERN = Pattern.compile(
            "^[A-Za-zÇçĞğıİÖöŞşÜüƏəıİ\\s]{2,50}$"
    );

    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email.trim()).matches();
    }

    public static boolean isValidPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            return false;
        }

        String cleanPhone = phone.replaceAll("[\\s-+]", "");
        if (cleanPhone.startsWith("994")) {
            cleanPhone = cleanPhone.substring(3);
        }

        return PHONE_PATTERN.matcher(cleanPhone).matches();
    }

    public static boolean isValidAzerbaijaniNationalId(String nationalId) {
        if (nationalId == null || nationalId.trim().isEmpty()) {
            return false;
        }

        String cleanId = nationalId.trim().toUpperCase();
        return NATIONAL_ID_PATTERN.matcher(cleanId).matches() && cleanId.startsWith("AZ");
    }

    public static boolean isValidName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        String trimmedName = name.trim();
        return trimmedName.length() >= 2 &&
                trimmedName.length() <= 50 &&
                NAME_PATTERN.matcher(trimmedName).matches();
    }

    public static boolean isValidBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            return false;
        }

        LocalDate now = LocalDate.now();
        LocalDate maxBirthDate = now.minusYears(120);
        return !birthDate.isAfter(now) && !birthDate.isBefore(maxBirthDate);
    }
}