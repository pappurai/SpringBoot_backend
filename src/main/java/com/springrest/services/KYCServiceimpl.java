package com.springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.KYCdao;
import com.springrest.entities.KYC;
@Service
public class KYCServiceimpl implements KYCService  {
	
	@Autowired
	private KYCdao kycdao;
	
	public KYCServiceimpl() {

	}

	@Override
	public KYC kycuser(KYC kycdetails) {
		KYC kyc=kycdao.save(kycdetails);
		return kyc;
	}

}
