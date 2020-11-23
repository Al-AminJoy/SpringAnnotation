package com.alamin.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Auto Configuration
@ComponentScan(basePackages="com.alamin.SpringAnnotation")
public class AppConfig {
	/*
	 * For Using Configuration 
    @Bean
	public Samsung getPhone(){
		return new Samsung();
	}
    @Bean
    public MobileProcessor getProcessor(){
    	
    	return new Snapdragon();
    }
    */
}
