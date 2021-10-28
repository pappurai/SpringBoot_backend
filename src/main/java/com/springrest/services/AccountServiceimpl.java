package com.springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.AccountDao;
import com.springrest.dao.RegistrationDao;
import com.springrest.entities.Account;
import com.springrest.entities.Registration;


@Service
public class AccountServiceimpl   implements AccountService {
	
	@Autowired
	private AccountDao accountdao;
	
	public AccountServiceimpl() {

	}

	@Override
	public Account accountuser(Account accountdetails) {
		Account account=accountdao.save(accountdetails);
		return account;
	}

	
	
}
