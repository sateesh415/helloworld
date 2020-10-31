package com.example.Hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HellospringApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(HellospringApplication.class, args);
		Hello s = run.getBean(Hello.class); 
		s.print();
		s.sample();
		
		
	}

}
