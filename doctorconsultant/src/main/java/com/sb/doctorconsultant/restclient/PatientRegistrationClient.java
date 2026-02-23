package com.sb.doctorconsultant.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sb.doctorconsultant.dto.Patient;
@FeignClient("gatewayservice")
public interface PatientRegistrationClient {

	@GetMapping("/patientregistration/patient/{id}")
	Patient getPatient(@PathVariable int id);
}
