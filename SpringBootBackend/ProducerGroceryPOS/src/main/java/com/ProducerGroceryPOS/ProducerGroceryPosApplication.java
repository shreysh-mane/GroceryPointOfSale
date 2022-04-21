package com.ProducerGroceryPOS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication//(scanBasePackages={"com.ProducerGrocery.Controller","com.ProducerGrocery.Service","com.ProducerGrocery.Repository","com.ProducerGrocery.Entity"})
//@ComponentScan({"com.ProducerGrocery.Repository"})
//@EnableAutoConfiguration//(exclude={DataSourceAutoConfiguration.class})

@EnableEurekaClient
@Configuration
public class ProducerGroceryPosApplication {

//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate()
//	{
//		return new RestTemplate();
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProducerGroceryPosApplication.class, args);
	}

}
