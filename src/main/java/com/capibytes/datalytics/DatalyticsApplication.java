package com.capibytes.datalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.capibytes.datalytics.repositories")
@ComponentScan(basePackages = "com.capibytes.datalytics.domain.mappers")
public class DatalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatalyticsApplication.class, args);


	}

}
