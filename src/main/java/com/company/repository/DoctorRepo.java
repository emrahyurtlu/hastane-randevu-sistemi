package com.company.repository;

import com.company.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
}

