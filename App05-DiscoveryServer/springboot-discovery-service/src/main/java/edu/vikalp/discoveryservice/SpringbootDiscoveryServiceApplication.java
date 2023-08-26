package edu.vikalp.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDiscoveryServiceApplication.class, args);
	}

}
