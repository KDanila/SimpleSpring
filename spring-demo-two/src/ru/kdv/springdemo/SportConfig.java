package ru.kdv.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:fortune-date.properties")
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(fileAdvisoryFactory());
	}
	
	@Bean
	public AdviseFactory fileAdvisoryFactory() {
		return new FileAdvisoryFactory();
	}

}
