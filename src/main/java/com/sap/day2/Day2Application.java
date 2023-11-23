package com.sap.day2;

import com.sap.day2.web_ui.config.SpringWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebConfiguration.class, args);
	}

}
