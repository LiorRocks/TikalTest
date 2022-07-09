package com.tikal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Init init = new Init();
		init.initMoneyRepository();
		SpringApplication.run(DemoApplication.class, args);
	}

}
