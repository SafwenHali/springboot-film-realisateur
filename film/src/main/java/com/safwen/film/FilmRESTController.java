package com.safwen.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safwen.film.entities.Film;
import com.safwen.film.service.FilmService;

@RestController
@RequestMapping("/api")
public class FilmRESTController {
	@Autowired
	FilmService FilmService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Film> getAllFilms() {
		return FilmService.getAllFilms() ;	
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Film getFilmById(@PathVariable("id") Long id) {
		return FilmService.getFilm(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Film createFilm(@RequestBody Film Film) {
		return FilmService.saveFilm(Film);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Film updateFilm(@RequestBody Film Film) {
		return FilmService.updateFilm(Film);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFilm(@PathVariable("id") Long id){
		FilmService.deleteFilmById(id);
	}
	/*
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Film> getFilmsByCatId(@PathVariable("idCat") Long idCat) {
		return FilmService.findByCategorieIdCat(idCat);
	}*/
}
