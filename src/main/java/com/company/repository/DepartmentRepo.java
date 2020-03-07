package com.company.repository;

import com.company.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {
}

