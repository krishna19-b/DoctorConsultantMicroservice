package com.sb.doctorconsultant.service;

import java.util.List;

import com.sb.doctorconsultant.doctor.Doctor;

public interface DoctorService {

	
	  Doctor save(Doctor doctor);
	  Doctor update(Doctor  doctor);
	    void delete(Doctor Doctor);
	    Doctor findById(int id);
	    List<Doctor> findAll();
}
