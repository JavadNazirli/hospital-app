package org.example.appointment.repository;

import org.example.appointment.entity.Appointment;
import org.example.common.base.BaseRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends BaseRepository<Appointment, Long> {
    List<Appointment> findByDoctor(Long doctorId);

    List<Appointment> findByPatient(Long patientId);

    List<Appointment> findByDate(LocalDate date);
}
