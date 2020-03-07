package com.company.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "TIME_TABLES")
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIME_TABLE_SEQ")
    @Column(name = "TIME_TABLE_ID")
    private Integer timeTableId;

    @OneToOne
    @JoinColumn(name = "DOCTOR_ID")
    private Doctor doctor;

    @OneToOne
    @JoinColumn(name = "PATIENT_ID")
    private Patient patient;

    @Column(name = "RESERVATION_DATE")
    private LocalDate date;

    @Column(name = "RESERVATION_TIME")
    private LocalTime time;

    public Timetable() {
    }

    public Timetable(Doctor doctor, Patient patient, LocalDate date, LocalTime time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }

    public Integer getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(Integer timeTableId) {
        this.timeTableId = timeTableId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "timeTableId=" + timeTableId +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
