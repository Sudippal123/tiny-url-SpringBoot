package com.example.tiny_url;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TinyUrlApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach((e)->System.setProperty(e.getKey(),e.getValue()));
		SpringApplication.run(TinyUrlApplication.class, args);
	}

}
