package com.gfg.firstSpring;

import com.gfg.firstSpring.controller.FirstController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		System.out.println("Entry Point of the code!");
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
