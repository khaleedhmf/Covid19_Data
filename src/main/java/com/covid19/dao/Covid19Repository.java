package com.covid19.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid19.bean.Covid19Bean;

@Repository
public interface Covid19Repository extends JpaRepository<Covid19Bean , Integer> {

	

}
