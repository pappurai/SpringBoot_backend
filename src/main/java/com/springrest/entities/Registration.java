package com.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private  String nameOfbusiness;
	private String address;
	private String pincode;
	private String city;
	private String state;
	private String gst;
	private String shopphoto;
	private String yourname;
	private String dateOfBirth;
	private String emailid;
	private String ownerphoto;
	public Registration(long id, String nameOfbusiness, String address, String pincode, String city, String state,
			String gst, String shopphoto, String yourname, String dateOfBirth, String emailid, String ownerphoto) {
		super();
		this.id = id;
		this.nameOfbusiness = nameOfbusiness;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.gst = gst;
		this.shopphoto = shopphoto;
		this.yourname = yourname;
		this.dateOfBirth = dateOfBirth;
		this.emailid = emailid;
		this.ownerphoto = ownerphoto;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameOfbusiness() {
		return nameOfbusiness;
	}
	public void setNameOfbusiness(String nameOfbusiness) {
		this.nameOfbusiness = nameOfbusiness;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getShopphoto() {
		return shopphoto;
	}
	public void setShopphoto(String shopphoto) {
		this.shopphoto = shopphoto;
	}
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getOwnerphoto() {
		return ownerphoto;
	}
	public void setOwnerphoto(String ownerphoto) {
		this.ownerphoto = ownerphoto;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", nameOfbusiness=" + nameOfbusiness + ", address=" + address + ", pincode="
				+ pincode + ", city=" + city + ", state=" + state + ", gst=" + gst + ", shopphoto=" + shopphoto
				+ ", yourname=" + yourname + ", dateOfBirth=" + dateOfBirth + ", emailid=" + emailid + ", ownerphoto="
				+ ownerphoto + "]";
	}
	
	
	
}