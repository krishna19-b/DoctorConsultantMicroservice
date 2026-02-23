package com.sb.patientRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.patientRegistration.patient.Patient;
import com.sb.patientRegistration.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping("/")
	public List<Patient> findAll(){
		
		return patientService.findAll();
	}
	
	@PostMapping("/")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.save(patient);
	}
	
    @PutMapping("/")
    public Patient updatepatient(@RequestBody Patient patient) {
    	return patientService.save(patient);
    }
    
    @GetMapping("/{id}")
    public Patient getById(@PathVariable int id) {
    	return patientService.findById(id);
    }
    
    @DeleteMapping("")
    	public void delete(@RequestBody Patient patient) {
    		patientService.delete(patient);
    	}
    }
