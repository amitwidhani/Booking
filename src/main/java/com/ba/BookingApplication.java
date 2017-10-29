package com.ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}	
	
	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}	
}
