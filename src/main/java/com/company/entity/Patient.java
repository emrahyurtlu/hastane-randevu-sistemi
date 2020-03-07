package com.company.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PATIENT")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PATIENT_SEQ")
    @Column(name = "PATIENT_ID")
    private Integer patientId;

    @Column(name = "PATIENT_SSN", nullable = false)
    private String ssn;

    @Column(name = "PATIENT_NAME", nullable = false)
    private String name;

    @Column(name = "PATIENT_SURNAME", nullable = false)
    private String surname;

    @Column(name = "PATIENT_DOB")
    private Date birthDate;

    public Patient() {
    }

    public Patient(String ssn, String name, String surname, Date birthDate) {
        this.ssn = ssn;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
