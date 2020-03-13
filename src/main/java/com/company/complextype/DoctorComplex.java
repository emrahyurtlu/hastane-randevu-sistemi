package com.company.complextype;

import com.company.entity.Doctor;
import org.springframework.web.multipart.MultipartFile;

public class DoctorComplex implements BaseComplex {
    private Doctor doctor;

    private MultipartFile file;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
