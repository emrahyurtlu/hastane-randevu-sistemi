package com.company.repository;

import com.company.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
    List<Doctor> getAllByOrderByDoctorIdDesc();
}

