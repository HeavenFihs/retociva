package com.example.retoc.retociva;

import org.springframework.boot.SpringApplication;

public class TestRetocivaApplication {

	public static void main(String[] args) {
		SpringApplication.from(RetocivaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
