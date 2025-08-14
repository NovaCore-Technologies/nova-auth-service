package com.technologies.novacore.nova_auth_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class NovaAuthServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
