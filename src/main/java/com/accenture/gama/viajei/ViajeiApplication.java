package com.accenture.gama.viajei;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.accenture.gama.viajei.start.Start;

@SpringBootApplication
public class ViajeiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViajeiApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run( Start st) {
        return args -> {
        	st.init();
        	
        };
    }

}
