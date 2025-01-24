package com.serasRest.serasRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class SerasRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerasRestApplication.class, args);
	}

}
