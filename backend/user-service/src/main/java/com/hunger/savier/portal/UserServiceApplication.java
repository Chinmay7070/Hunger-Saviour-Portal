package com.hunger.savier.portal;

import com.hunger.savier.portal.dtoes.RsakeyConfigurationPropertiies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableConfigurationProperties(RsakeyConfigurationPropertiies.class)
@EnableDiscoveryClient
public class  UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
