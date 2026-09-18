package com.dcl.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//convert one Java object into another Java object without this we have to write setters and getters manually
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
		
	}

}