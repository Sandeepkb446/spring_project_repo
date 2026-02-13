package com.kodewala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.kodewala.acc.AccountDetails;

@Component
public class AccountMng {
	
	@Autowired
	 AccountDetails accdt;
	
	
	public void doAccounts() {
		System.out.println("welcome");
	}
	
	

}
