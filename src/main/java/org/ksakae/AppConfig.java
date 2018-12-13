package org.ksakae;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	//JavaベースConfiguration
	@Bean
	ConfigJava user() {
		return new ConfigJava();
	}

}
