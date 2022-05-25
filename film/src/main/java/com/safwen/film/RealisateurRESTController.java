package com.safwen.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safwen.film.entities.Realisateur;
import com.safwen.film.service.RealisateurService;

@RestController
@RequestMapping("/R")
public class RealisateurRESTController {

  @Autowired
  RealisateurService RealisateurService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Realisateur> getAllRealisateurs() {
		return RealisateurService.getAllRealisateurs() ;	
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Realisateur getRealisateurById(@PathVariable("id") Long id) {
		return RealisateurService.getRealisateur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Realisateur createRealisateur(@RequestBody Realisateur Realisateur) {
		return RealisateurService.saveRealisateur(Realisateur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Realisateur updateRealisateur(@RequestBody Realisateur Realisateur) {
		return RealisateurService.updateRealisateur(Realisateur);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteRealisateur(@PathVariable("id") Long id){
		RealisateurService.deleteRealisateurById(id);
	}
	

}
