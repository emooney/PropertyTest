package com.emooney.spring.propertytest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyTestApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger((PropertyTestApplication.class));
	
	public static void main(String[] args) {
		SpringApplication.run(PropertyTestApplication.class, args);
	}
	
	@Value("${application.name}")
	private String applicationName;
	
	@Value("${user}")
	private String user;

	@Override
	public void run(String... arg0) throws Exception {
		log.info("Application name: {}, Username: {}", applicationName, user);
		
	}
}
