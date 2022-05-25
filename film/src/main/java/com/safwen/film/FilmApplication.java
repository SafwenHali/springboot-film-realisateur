package com.safwen.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.safwen.film.entities.Film;

@SpringBootApplication
public class FilmApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}

	  @Override
	  public void run(String... args) throws Exception {
		  repositoryRestConfiguration.exposeIdsFor(Film.class);
	  }
}