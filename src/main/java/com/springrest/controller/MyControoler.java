package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Account;
import com.springrest.entities.KYC;
import com.springrest.entities.Registration;
import com.springrest.services.AccountService;
import com.springrest.services.KYCService;
import com.springrest.services.RegistrationService;




@RestController
public class MyControoler {
	@Autowired
	private RegistrationService registeritem;
	
	@Autowired
	private AccountService accountitem;
	
	
	@Autowired
	private KYCService kycitem;
	
	
	@PostMapping("/merchantregister")
	public Registration registrationuser(@RequestBody Registration registrationuserdetails)
	{
		
		

return this.registeritem.registrationuser(registrationuserdetails);
			
	}
	
	
	
	
	@PostMapping("/merchantaccount")
	public Account accountuser(@RequestBody Account accountuserdetails)
	{
		
return this.accountitem.accountuser(accountuserdetails);
			
	}
	
	@PostMapping("/kycdetails")
	public KYC kycuser(@RequestBody KYC kycuserdetails)
	{
		
return this.kycitem.kycuser(kycuserdetails);
			
	}
	

}
