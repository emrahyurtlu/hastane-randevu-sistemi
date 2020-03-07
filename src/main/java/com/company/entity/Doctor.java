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
}
