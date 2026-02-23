package com.sb.doctorconsultant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.doctorconsultant.doctor.Doctor;
import com.sb.doctorconsultant.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{

	
	@Autowired
	DoctorRepository doctorRep;
	@Override
	public Doctor save(Doctor doctor) {
		return doctorRep.save(doctor);
	}

	@Override
	public Doctor update(Doctor doctor) {
		return doctorRep.save(doctor);
	}

	@Override
	public void delete(Doctor doctor) {
		doctorRep.delete(doctor);
	}

	@Override
	public Doctor findById(int id) {
		return doctorRep.findById(id).get();
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRep.findAll();
	}
	

}
