package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCTOR_SEQ")
    @Column(name = "DOCTOR_ID")
    private Integer doctorId;

    @Column(name = "DOCTOR_NAME")
    private String name;

    @Column(name = "DOCTOR_SURNAME")
    private String surname;

    // Sicil No
    @Column(name = "DOCTOR_REGISTRATION_NUMBER")
    private String regNum;

    @Column(name = "DOCTOR_IMAGE_LINK")
    private String imageLink;

    public Doctor() {
    }

    public Doctor(Integer doctorId, String name, String surname, String regNum, String imageLink) {
        this.doctorId = doctorId;
        this.name = name;
        this.surname = surname;
        this.regNum = regNum;
        this.imageLink = imageLink;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", regNum='" + regNum + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
