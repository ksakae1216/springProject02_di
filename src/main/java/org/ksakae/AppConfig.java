package org.ksakae;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.ksakae")
public class AppConfig {

	//JavaベースConfiguration
	@Bean
	User user() {
		return new User();
	}

}
