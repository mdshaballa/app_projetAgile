package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("entity")
@EnableJpaRepositories(basePackages = {"repository"})
@Configuration
@EnableAutoConfiguration
@ComponentScan("controller")
@SpringBootApplication
public class ProjetAgileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetAgileApplication.class, args);
	}

}