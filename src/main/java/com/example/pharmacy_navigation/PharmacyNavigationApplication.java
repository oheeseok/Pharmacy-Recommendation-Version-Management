package com.example.pharmacy_navigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PharmacyNavigationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyNavigationApplication.class, args);
	}

}
