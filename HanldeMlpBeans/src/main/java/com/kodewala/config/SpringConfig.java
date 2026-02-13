package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.acc.AccountDetails;

@Configuration
@ComponentScan("com.kodewala")
public class SpringConfig {

	@Bean
	@Primary
	public AccountDetails createAccountObj() {
		System.out.println("SpringConfig.createAccountObj()");
		return new AccountDetails();
	}
	@Bean
	public AccountDetails getAccountObj() {
		System.out.println("SpringConfig.getAccount()");
		return new AccountDetails();
	}
}
