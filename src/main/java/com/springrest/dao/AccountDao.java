package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.entities.Account;


public interface AccountDao extends JpaRepository <Account ,Long> {

}
