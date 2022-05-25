
//FilmServiceImp.java
package com.safwen.film.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safwen.film.entities.Realisateur;
import com.safwen.film.entities.Film;
import com.safwen.film.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
  @Autowired
  FilmRepository FilmRepository;

  @Override
  public Film saveFilm(Film f) {
    return FilmRepository.save(f);
  }

  @Override
  public Film updateFilm(Film f) {
    return FilmRepository.save(f);
  }

  @Override
  public void deleteFilm(Film f) {
    FilmRepository.delete(f);
  }

  @Override
  public void deleteFilmById(Long id) {
    FilmRepository.deleteById(id);
  }

  @Override
  public Film getFilm(Long id) {
    return FilmRepository.findById(id).get();
  }

  @Override
  public List<Film> getAllFilms() {
    return FilmRepository.findAll();
  }

	
	@Override
	public List<Film> findByRealisateur(Realisateur realisateur) {
		return FilmRepository.findByRealisateur(realisateur) ;
	}
	
	@Override
	public List<Film> findByRealisateurId(Long id) {
		return FilmRepository.findByRealisateurId(id) ;
	}
	

}
