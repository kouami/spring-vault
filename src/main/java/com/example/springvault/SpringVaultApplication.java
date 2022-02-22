package com.example.springvault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringVaultApplication {


	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringVaultApplication.class);
		ConfigurableApplicationContext context = SpringApplication.run(SpringVaultApplication.class, args);
		VaultConfiguration vaultConfiguration = context.getBean(VaultConfiguration.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   name.firstName is {}", vaultConfiguration.getFirstName());
		logger.info("   name.lastName is {}", vaultConfiguration.getLastName());
		logger.info("----------------------------------------");
	}


}
