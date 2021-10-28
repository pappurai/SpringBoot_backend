package com.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springrest.entities.Registration;

public interface RegistrationDao extends JpaRepository <Registration ,Long> {
	
	 @Query("SELECT emailid,shopphoto,ownerphoto FROM Registration r where r.emailid = ?1")
	 public List<Registration> findByEmail(String email);
	
	 @Query("UPDATE Registration r SET r.shopphoto=?1, r.ownerphoto=?2 WHERE r.id=?3")
	 public boolean updatePhotoPath(String shopphoto, String ownerphoto,int id);
}
