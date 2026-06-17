package com.example.hospitalmanage;

import com.example.hospitalmanage.entity.Patient;
import com.example.hospitalmanage.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HospitalmanageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HospitalmanageApplication.class, args);
	}
	@Autowired
	private final PatientRepository patientRepository;

	public HospitalmanageApplication(PatientRepository patientRepository) {this.patientRepository=patientRepository;}

    @Override
	public void run(String... args) throws Exception {
		List<Patient> PatientData = patientRepository.findAll();
		System.out.println("PatientData: "+PatientData);
	}



}
