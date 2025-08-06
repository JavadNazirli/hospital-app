package org.example.common.util.validator.validatorUtils;


import java.time.LocalDateTime;
import java.util.regex.Pattern;

public final class AppointmentValidationUtils {

    private AppointmentValidationUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    private static final Pattern ROOM_NUMBER_PATTERN = Pattern.compile("^[A-Z0-9]{1,10}$");

    public static boolean isValidRoomNumber(String roomNumber) {
        if (roomNumber == null || roomNumber.trim().isEmpty()) {
            return false;
        }
        return ROOM_NUMBER_PATTERN.matcher(roomNumber.trim().toUpperCase()).matches();
    }

    public static boolean isValidAppointmentTime(LocalDateTime appointmentTime) {
        if (appointmentTime == null) {
            return false;
        }

        if (!appointmentTime.isAfter(LocalDateTime.now())) {
            return false;
        }

        int hour = appointmentTime.getHour();
        return hour >= 8 && hour < 18;
    }
}