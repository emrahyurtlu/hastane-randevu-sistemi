package com.company.repository;

import com.company.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepo extends CrudRepository<Patient, Integer> {
}
