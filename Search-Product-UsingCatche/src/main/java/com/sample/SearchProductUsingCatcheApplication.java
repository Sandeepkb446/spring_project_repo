package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SearchProductUsingCatcheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchProductUsingCatcheApplication.class, args);
	}

}
