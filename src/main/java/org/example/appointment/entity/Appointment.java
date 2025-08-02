package org.example.appointment.entity;

import lombok.*;
import org.example.common.model.enums.AppointmentStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private LocalDateTime appointmentDateTime;
    private AppointmentStatus status;
    private String notes;
    private boolean isActive;
    private LocalDateTime createdAt;
}
