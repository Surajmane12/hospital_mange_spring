package com.example.hospitalmanage;

import com.example.hospitalmanage.entity.Patient;
import com.example.hospitalmanage.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private  PatientRepository patientRepository;

    @Test
    public void getPatients() {

        List<Patient> patientData = patientRepository.findAll();
        System.out.println("Data: "+patientData);
    }
}
