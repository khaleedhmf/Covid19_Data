package com.covid19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.covid19.bean.Covid19Bean;
import com.covid19.controller.Covid19Controller;
//import com.covid19.dao.Covid19Repository;

@SpringBootApplication
@ComponentScan(basePackages = "com.covid19.*")
public class Covid19Application {

	public static void main(String[] args) {
		SpringApplication.run(Covid19Application.class, args);
		
		
	}

}
