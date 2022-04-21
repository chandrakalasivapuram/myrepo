package com.olx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.olx.dto.DBConfig;

@SpringBootApplication
public class MiscTopicsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscTopicsDemoApplication.class, args);
	}
	@Bean
	public DBConfig getDBConfig() {
	DBConfig dbConfig = new DBConfig("jdbc:odbc://localhost:3306/testdb","testuser");
	return dbConfig;
	}
}
