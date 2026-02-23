package com.sb.doctorconsultant.controller;

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

import com.sb.doctorconsultant.doctor.Doctor;
import com.sb.doctorconsultant.dto.Patient;
import com.sb.doctorconsultant.restclient.PatientRegistrationClient;
import com.sb.doctorconsultant.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/")
	public List<Doctor> findAll(){
		
		return doctorService.findAll();
	}
	@Autowired
	PatientRegistrationClient patientRegister;
	@PostMapping("/")
	public Doctor savePatient(@RequestBody Doctor doctor) {
		Patient pt=patientRegister.getPatient(doctor.getPatientid());
		System.out.print(pt);
		return doctorService.save(doctor);
	}
	
    @PutMapping("/")
    public Doctor updatepatient(@RequestBody Doctor doctor) {
    	return doctorService.save(doctor);
    }
    
    @GetMapping("/{id}")
    public Doctor getById(@PathVariable int id) {
    	return doctorService.findById(id);
    }
    
    @DeleteMapping("")
    	public void delete(@RequestBody Doctor doctor) {
    	doctorService.delete(doctor);
    	}
}
