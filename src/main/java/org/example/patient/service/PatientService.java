package org.example.patient.service;

import org.example.common.base.BaseService;
import org.example.patient.entity.Patient;

import java.util.Optional;

public interface PatientService extends BaseService<Patient, Long> {
    boolean existsByNationalId(String nationalId);

    Optional<Patient> findByNationalId(String nationalId);

    Patient registerNewPatient(Patient patient);

    boolean isPatientActive(Long patientId);

    void deactivatePatient(Long patientId);

    void activatePatient(Long patientId);
}
