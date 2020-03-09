package com.company.service;

import com.company.entity.Department;
import com.company.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService implements BaseService<Department> {
    private final DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public Department get(Integer id) {
        return departmentRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Department> getList() {
        var departments = new ArrayList<Department>();
        departmentRepo.findAll().forEach(departments::add);
        return departments;
    }

    @Override
    public Department save(Department entity) {
        return departmentRepo.save(entity);
    }

    @Override
    public void delete(Integer id) {
        departmentRepo.deleteById(id);
    }
}
