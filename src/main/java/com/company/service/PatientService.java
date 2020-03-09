package com.company.service;

import com.company.entity.Patient;
import com.company.repository.PatientRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService implements BaseService<Patient> {
    private final PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @Override
    public Patient get(Integer id) {
        return patientRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Patient> getList() {
        var patients = new ArrayList<Patient>();
        patientRepo.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Patient save(Patient entity) {
        return patientRepo.save(entity);
    }

    @Override
    public void delete(Integer id) {
        patientRepo.deleteById(id);
    }
}
