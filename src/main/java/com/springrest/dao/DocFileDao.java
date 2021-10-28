package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springrest.entities.FileDocument;


public interface DocFileDao extends JpaRepository <FileDocument ,Long> {
	


}
