package com.safwen.film.repos;

import com.safwen.film.entities.Realisateur;
import com.safwen.film.entities.Film;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film, Long> {
	List<Film> findByNomFilm(String nom);
	
	
	@Query("select f from Film f where f.realisateur = ?")
	List<Film> findByRealisateur (Realisateur realisateur);
	
	List<Film> findByRealisateurId(Long id);
	
}