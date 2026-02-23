package com.sb.patientRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.patientRegistration.patient.Patient;
import com.sb.patientRegistration.patientRepository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService{
  
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient update(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public void delete(Patient patient) {
		
		patientRepository.delete(patient);
	}

	@Override
	public Patient findById(int id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}

}
