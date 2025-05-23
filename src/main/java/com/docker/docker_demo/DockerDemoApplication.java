package com.docker.docker_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);

		System.out.println("\n-------------\n Started..✅\n-------------");
	}

}
