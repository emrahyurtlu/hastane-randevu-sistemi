package com.company.repository;

import com.company.entity.Timetable;
import org.springframework.data.repository.CrudRepository;

public interface TimetableRepo extends CrudRepository<Timetable, Integer> {
}
