package com.example.hospitalmanage.entity;

import com.example.hospitalmanage.entity.type.GenderType;
import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @Column(unique = true,nullable = false,length = 20)
    private String phone;

    @Column(unique = true, nullable = false)
    private String email;

    @ToString.Exclude
    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    private GenderType gender;

    @Column(
            name = "created_at",
            insertable = false,
            updatable = false
    )
    private LocalDateTime createdAt;
}
