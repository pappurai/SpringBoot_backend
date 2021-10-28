package com.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KYC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private  String pannumber;
	private String panfrontphoto;
	private String panbackphoto;
	private String addressfrontphoto;
	private String addressbackphoto;
	private String idnumber;
	public KYC(long id, String pannumber, String panfrontphoto, String panbackphoto, String addressfrontphoto,
			String addressbackphoto, String idnumber) {
		super();
		this.id = id;
		this.pannumber = pannumber;
		this.panfrontphoto = panfrontphoto;
		this.panbackphoto = panbackphoto;
		this.addressfrontphoto = addressfrontphoto;
		this.addressbackphoto = addressbackphoto;
		this.idnumber = idnumber;
	}
	public KYC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public String getPanfrontphoto() {
		return panfrontphoto;
	}
	public void setPanfrontphoto(String panfrontphoto) {
		this.panfrontphoto = panfrontphoto;
	}
	public String getPanbackphoto() {
		return panbackphoto;
	}
	public void setPanbackphoto(String panbackphoto) {
		this.panbackphoto = panbackphoto;
	}
	public String getAddressfrontphoto() {
		return addressfrontphoto;
	}
	public void setAddressfrontphoto(String addressfrontphoto) {
		this.addressfrontphoto = addressfrontphoto;
	}
	public String getAddressbackphoto() {
		return addressbackphoto;
	}
	public void setAddressbackphoto(String addressbackphoto) {
		this.addressbackphoto = addressbackphoto;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	@Override
	public String toString() {
		return "KYC [id=" + id + ", pannumber=" + pannumber + ", panfrontphoto=" + panfrontphoto + ", panbackphoto="
				+ panbackphoto + ", addressfrontphoto=" + addressfrontphoto + ", addressbackphoto=" + addressbackphoto
				+ ", idnumber=" + idnumber + "]";
	}
	
	
}