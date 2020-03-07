package com.company.controller;

import com.company.entity.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PatientController {
    @GetMapping("/patients")
    public List<Patient> getList() {
        return null;
    }

    @GetMapping("/patients/{id}")
    public Patient get(@PathVariable Integer id) {
        return null;
    }

    @PostMapping(value = "/patients")
    public Patient add(@RequestBody Patient patient) {
        return null;
    }

    @PutMapping(value = "/patients")
    public Patient update(@RequestBody Patient patient) {
        return null;
    }

    @DeleteMapping(value = "/patients/{id}")
    public Patient remove(@PathVariable Integer id) {
        return null;
    }
}
