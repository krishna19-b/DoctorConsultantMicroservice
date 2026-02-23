package com.sb.patientRegistration.patientRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.patientRegistration.patient.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
