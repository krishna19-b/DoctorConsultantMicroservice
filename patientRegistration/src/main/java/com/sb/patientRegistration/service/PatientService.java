package com.sb.patientRegistration.service;

import java.util.List;
import com.sb.patientRegistration.patient.*;

public interface PatientService {
	  Patient save(Patient patient);
	  Patient update(Patient  patient);
	    void delete(Patient patient);
	    Patient findById(int id);
	    List<Patient> findAll();
}
