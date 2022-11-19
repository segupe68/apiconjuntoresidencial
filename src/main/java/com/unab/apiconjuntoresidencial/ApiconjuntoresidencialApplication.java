package com.unab.apiconjuntoresidencial;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

@EnableJpaAuditing

public class ApiconjuntoresidencialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiconjuntoresidencialApplication.class, args);
		System.out.println("Api corriendo...");

	}

	@Bean
	public ModelMapper modelMapper(){

		ModelMapper modelMapper= new ModelMapper();

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);	

		return modelMapper;
	}

}
