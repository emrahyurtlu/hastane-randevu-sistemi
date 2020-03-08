package com.company.service;

import com.company.entity.Doctor;
import com.company.repository.DoctorRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService implements BaseService<Doctor> {
    private final DoctorRepo doctorRepo;

    public DoctorService(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }


    @Override
    public Doctor get(Integer id) {
        return doctorRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Doctor> getList() {
        List<Doctor> doctors = new ArrayList<Doctor>();
        doctorRepo.findAll().forEach(doctors::add);
        return doctors;
    }

    @Override
    public Doctor insert(Doctor entity) {
        return doctorRepo.save(entity);
    }

    @Override
    public Doctor update(Doctor entity) {
        return doctorRepo.save(entity);
    }

    @Override
    public void delete(Integer id) {
        doctorRepo.deleteById(id);
    }
}
