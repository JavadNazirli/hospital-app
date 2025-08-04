package org.example.doctor.repository;

import org.example.common.base.BaseRepository;
import org.example.common.model.enums.Branches;
import org.example.doctor.entity.Doctor;

import java.util.List;

public interface DoctorRepository extends BaseRepository<Doctor, Long> {
    List<Doctor> findByBranch(Branches branch);

    boolean existsByNationalId(String nationalId);
}
