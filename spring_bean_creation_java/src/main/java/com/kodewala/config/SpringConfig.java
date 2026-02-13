package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.person.Person;

@Configuration
public class SpringConfig {

	@Bean("p1")  
	public Person createPerson() {
		Person p1 = new Person();
		p1.setUserName("Sandeep123");
		p1.setPassword("hgseuydgyu");
		
		return p1;
	}
	
	
}
