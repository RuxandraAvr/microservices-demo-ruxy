package com.example.democonfigserverm2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfigServerM2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigServerM2Application.class, args);
	}
}
