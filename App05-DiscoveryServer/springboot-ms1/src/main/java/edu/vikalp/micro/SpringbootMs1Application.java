package edu.vikalp.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMs1Application.class, args);
	}

}
