package com.company.service;

import com.company.entity.Hospital;
import com.company.repository.HospitalRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService implements BaseService<Hospital> {
    private final HospitalRepo hospitalRepo;

    public HospitalService(HospitalRepo hospitalRepo) {
        this.hospitalRepo = hospitalRepo;
    }

    @Override
    public Hospital get(Integer id) {
        return hospitalRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Hospital> getList() {
        var hospitals = new ArrayList<Hospital>();
        hospitalRepo.findAll().forEach(hospitals::add);
        return hospitals;
    }

    @Override
    public Hospital insert(Hospital entity) {
        return hospitalRepo.save(entity);
    }

    @Override
    public Hospital update(Hospital entity) {
        return hospitalRepo.save(entity);
    }

    @Override
    public void delete(Integer id) {
        hospitalRepo.deleteById(id);
    }
}
