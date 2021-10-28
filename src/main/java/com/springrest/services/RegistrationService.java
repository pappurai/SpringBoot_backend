package com.springrest.services;

import java.util.List;

import com.springrest.entities.Registration;

public interface RegistrationService {
	
	public Registration registrationuser(Registration registrationdetails);
	
	public List<Registration> findByEmail(String emailId);
	
	public boolean uploadPhoto(String shopPhoto, String ownerPhoto, int userId);

}
