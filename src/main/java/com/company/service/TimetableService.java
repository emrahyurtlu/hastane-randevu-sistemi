package com.company.service;

import com.company.entity.Timetable;
import com.company.repository.TimetableRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimetableService implements BaseService<Timetable> {
    private final TimetableRepo timetableRepo;

    public TimetableService(TimetableRepo timetableRepo) {
        this.timetableRepo = timetableRepo;
    }

    @Override
    public Timetable get(Integer id) {
        return timetableRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Timetable> getList() {
        var timetables = new ArrayList<Timetable>();
        timetableRepo.findAll().forEach(timetables::add);
        return timetables;
    }

    @Override
    public Timetable save(Timetable entity) {
        return timetableRepo.save(entity);
    }

    @Override
    public void delete(Integer id) {
        timetableRepo.deleteById(id);
    }
}
