package br.com.project.webmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class WebMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMoviesApplication.class, args);
	}

}
