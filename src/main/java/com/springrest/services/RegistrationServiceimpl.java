package com.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.RegistrationDao;
import com.springrest.entities.Registration;


@Service
public class RegistrationServiceimpl   implements RegistrationService {
	
	@Autowired
	private RegistrationDao registrationdao;
	
	public RegistrationServiceimpl() {

	}

	@Override
	public Registration registrationuser(Registration registrationdetails) {
	      Registration registration=registrationdao.save(registrationdetails);
		return registration;
	}
	
	public boolean uploadPhoto(String shopPhoto,String ownerPhoto,int userId) {
		return registrationdao.updatePhotoPath(shopPhoto, ownerPhoto, userId);
	}

	@Override
	public List<Registration> findByEmail(String emailId) {
		// TODO Auto-generated method stub
		 List<Registration> registration=(List<Registration>) registrationdao.findById((long) 1).orElse(new Registration());;
		return registration;
	}

}
