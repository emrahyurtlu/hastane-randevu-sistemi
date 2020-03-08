package com.company.repository;

import com.company.entity.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface HospitalRepo extends CrudRepository<Hospital, Integer> {
    Hospital getHospitalByCity(String city);
}

