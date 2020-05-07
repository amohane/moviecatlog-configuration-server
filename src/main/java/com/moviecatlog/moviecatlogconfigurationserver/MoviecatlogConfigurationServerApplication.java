package com.moviecatlog.moviecatlogconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MoviecatlogConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviecatlogConfigurationServerApplication.class, args);
	}

}
