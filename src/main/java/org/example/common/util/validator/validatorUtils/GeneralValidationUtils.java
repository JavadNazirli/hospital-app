package org.example.common.util.validator.validatorUtils;

public final class GeneralValidationUtils {

    private GeneralValidationUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean exceedsMaxLength(String str, int maxLength) {
        if (str == null) {
            return false;
        }
        return str.length() > maxLength;
    }

    public static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }
}
