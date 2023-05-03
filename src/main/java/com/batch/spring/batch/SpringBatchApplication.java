package com.batch.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.batch.spring.batch.util.DotenvClass.loadDotenv;

@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		loadDotenv();
		SpringApplication.run(SpringBatchApplication.class, args);
	}

}
