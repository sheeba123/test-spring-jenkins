package com.springjenkins;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringJenkinsApplication {


	@PostConstruct
	private void init() {
		System.out.println("in "+TestSpringJenkinsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TestSpringJenkinsApplication.class, args);
	}

}
