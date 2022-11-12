package com.unab.apiconjuntoresidencial;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication

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
