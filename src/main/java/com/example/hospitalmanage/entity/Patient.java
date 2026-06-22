package com.example.hospitalmanage.entity;

import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Table(
         uniqueConstraints = {
                 @UniqueConstraint(name = "unique_Patient_Emails", columnNames = {"email"}),
                 @UniqueConstraint(name = "unique_patient_name_email", columnNames = {"name","dob"})
         },
        indexes = {
                 @Index(name="idx_patient_birth_date", columnList = "dob")
        }
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String phone;

    private String email;

    @ToString.Exclude
    private LocalDate dob;

}
