package org.example.patient.repository;

import org.example.common.base.BaseRepository;
import org.example.patient.entity.Patient;

import java.util.Optional;

public interface PatientRepository extends BaseRepository<Patient, Long> {
    boolean existsByNationalId(String nationalId);

    Optional<Patient> findByNationalId(String nationalId);
}
