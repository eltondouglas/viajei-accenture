package com.accenture.gama.viajei.configuration;

import com.amadeus.Amadeus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:amadeus.properties")
public class AmadeusConfiguration {

    @Value("${AMADEUS_CLIENT_ID}")
    private String AMADEUS_CLIENT_ID;

    @Value("${AMADEUS_CLIENT_SECRET}")
    private String AMADEUS_CLIENT_SECRET;

    @Bean
    public Amadeus getAmadeus() {
        Amadeus amadeus = Amadeus.builder(this.AMADEUS_CLIENT_ID, this.AMADEUS_CLIENT_SECRET).build();
        return amadeus;
    }

}
