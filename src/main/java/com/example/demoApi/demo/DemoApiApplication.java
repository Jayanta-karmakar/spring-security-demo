package com.example.demoApi.demo;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApiApplication {

	private final Logger logger = LoggerFactory.getLogger(DemoApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		logger.info("Model Mapper Initialize");
		return new ModelMapper();
	}
}
