package com.safwen.film.service;

import java.util.List;

import com.safwen.film.entities.Realisateur;
import com.safwen.film.entities.Film;

public interface FilmService {
	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilms();

	List<Film> findByRealisateur (Realisateur Realisateur);
	List<Film> findByRealisateurId(Long id);
}
