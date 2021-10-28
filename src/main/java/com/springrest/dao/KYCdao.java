package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.KYC;



public interface  KYCdao extends JpaRepository <KYC ,Long> {

}
