package com.boot.bansis.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BansisConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BansisConfigServerApplication.class, args);
	}

}
