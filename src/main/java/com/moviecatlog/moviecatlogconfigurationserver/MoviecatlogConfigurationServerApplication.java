package com.moviecatlog.moviecatlogconfigurationserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class MoviecatlogConfigurationServerApplication {
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping("version")
	public String getAppVersion() {
		return appVersion;
	}
	public static void main(String[] args) {
		SpringApplication.run(MoviecatlogConfigurationServerApplication.class, args);
	}

}
