package org.example.doctor.service;

import org.example.common.base.BaseService;
import org.example.common.model.enums.Branches;
import org.example.doctor.entity.Doctor;

import java.util.List;

public interface DoctorService extends BaseService<Doctor, Long> {
    List<Doctor> findByBranch(Branches branch);

    boolean existsByNationalId(Long nationalId);

    List<Doctor> findActiveDoctorsByBranch(Branches branch);

    boolean isDoctorAvailable(Long doctorId);

    void assignRoomToDoctor(Long doctorId, Long roomNumber);

    void deactivateDoctor(Long doctorId);

    void activateDoctor(Long doctorId);

}
