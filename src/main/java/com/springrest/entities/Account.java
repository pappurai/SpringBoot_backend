package com.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private  String accountholdername;
	private String ifsc;
	private String accountnumber;
	private String confirmaccountnumber;
	private String commissiontype;
	public Account(long id, String accountholdername, String ifsc, String accountnumber, String confirmaccountnumber,
			String commissiontype) {
		super();
		this.id = id;
		this.accountholdername = accountholdername;
		this.ifsc = ifsc;
		this.accountnumber = accountnumber;
		this.confirmaccountnumber = confirmaccountnumber;
		this.commissiontype = commissiontype;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getConfirmaccountnumber() {
		return confirmaccountnumber;
	}
	public void setConfirmaccountnumber(String confirmaccountnumber) {
		this.confirmaccountnumber = confirmaccountnumber;
	}
	public String getCommissiontype() {
		return commissiontype;
	}
	public void setCommissiontype(String commissiontype) {
		this.commissiontype = commissiontype;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountholdername=" + accountholdername + ", ifsc=" + ifsc + ", accountnumber="
				+ accountnumber + ", confirmaccountnumber=" + confirmaccountnumber + ", commissiontype="
				+ commissiontype + "]";
	}
	
	

	
}
