package com.sb.doctorconsultant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.doctorconsultant.doctor.Doctor;
import com.sb.doctorconsultant.dto.Patient;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {



}
