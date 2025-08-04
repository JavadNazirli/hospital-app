package org.example.appointment.service;

import org.example.appointment.entity.Appointment;
import org.example.common.base.BaseService;
import org.example.common.model.enums.AppointmentStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentService extends BaseService<Appointment, Long> {
    List<Appointment> findByDoctor(Long doctorId);

    List<Appointment> findByPatient(Long patientId);

    List<Appointment> findByDate(LocalDate date);

    Appointment bookAppointment(Long doctorId, Long patientId, LocalDateTime appointmentDateTime);

    boolean isDoctorAvailableAtDateTime(Long doctorId, LocalDateTime appointmentDateTime);

    void cancelAppointment(Long appointmentId);

    void confirmAppointment(Long appointmentId);

    void completeAppointment(Long appointmentId, String notes);

    List<Appointment> findUpcomingAppointments(Long doctorId);

    List<Appointment> findTodayAppointments(Long doctorId);

    List<Appointment> findAppointmentsByStatus(AppointmentStatus status);

    boolean isAppointmentTimeValid(LocalDateTime appointmentDateTime);

    boolean hasConflictingAppointment(Long doctorId, LocalDateTime appointmentDateTime);

}
