package com.technologies.novacore.nova_auth_service;

import org.springframework.boot.SpringApplication;

public class TestNovaAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(NovaAuthServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
