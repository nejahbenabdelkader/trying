package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.model.License;

@Service
public class LicenseService {
	
	public License getLicense(String licenseId, String organisationId) {
		License license=new License();
		license.setLiscenseId(licenseId);
		license.setOrganisationId(organisationId);
		license.setDescription("Software product");
		license.setProductName("Osrock");
		license.setLiscenseType("full");
		
		return license;
		
	}
	
	public String createLicense(License license, String organisationId) {
		String responseMessage=null;
		if(license!=null) {
			license.setOrganisationId(organisationId);
			responseMessage=String.format("This is the post and the object is : %s", license.toString());
			
		}
		return responseMessage;
	}
	
	public String updateLicense(License license, String organisationId) {
		String responseMessage=null;
		if(license!=null) {
			license.setOrganisationId(organisationId);
			responseMessage=String.format("This is the put and the object is : %s", license.toString());
			
		}
		return responseMessage;
	}
	
	
	public String  deletingLicense(String licenseId,String organisationId) {
		String responseMessage=null;
		responseMessage=String.format("Deleting license with id %s and organisation Id %s",licenseId,organisationId);
		return responseMessage ;
	}
	
	
	

}
