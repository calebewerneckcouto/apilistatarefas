package br.com.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@EntityScan(basePackages = "br.com.react.model")
@ComponentScan(basePackages = {"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.react.repository"})
@EnableTransactionManagement
@EnableWebMvc
public class ApiListaTarefasReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiListaTarefasReactApplication.class, args);
	}
	
	

	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowedHeaders("*")
		.allowedMethods("*")
		.exposedHeaders("*");
		
		//WebMvcConfigurer.super.addCorsMappings(registry);
	}
	
	

	
}
	


