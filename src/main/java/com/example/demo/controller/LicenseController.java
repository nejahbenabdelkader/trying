package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.License;
import com.example.demo.service.LicenseService;

@RestController
@RequestMapping(value="/v1/organisation/{organisationId}/license")
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService ;
	
	@GetMapping("/{licenseId}")
	public ResponseEntity<License> getLicense(
			@PathVariable("organisationId") String organisationId,
			@PathVariable("licenseId") String licenseId) {
		License license=licenseService.getLicense(licenseId, organisationId);
		return ResponseEntity.ok(license);
		
	}
	
	@PutMapping
	public ResponseEntity<String> updateLicense(
			@PathVariable("organisationId") String organisationId,
			@RequestBody License request ) {
		return ResponseEntity.ok(licenseService.updateLicense(request, organisationId));
		
	}
	
	@PostMapping
	public ResponseEntity<String> createLicense(
			@PathVariable("organisationId") String organisationId ,
			@RequestBody License request) {
		return ResponseEntity.ok(licenseService.createLicense(request, organisationId));
	}
	
	@DeleteMapping("/{licenseId}")
	public ResponseEntity<String> deleteLicense(
			@PathVariable("organisationId") String organisationId,
			@PathVariable("licenseId") String licenseId) {
		return ResponseEntity.ok(licenseService.deletingLicense(licenseId, organisationId));
	}

}
