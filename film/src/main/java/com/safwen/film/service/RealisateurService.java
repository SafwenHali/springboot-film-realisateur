package com.safwen.film.service;


import java.util.List;

import com.safwen.film.entities.Realisateur;


public interface RealisateurService {
	Realisateur saveRealisateur(Realisateur r);
	Realisateur updateRealisateur(Realisateur r);
	void deleteRealisateur(Realisateur r);
	void deleteRealisateurById(Long id);
	Realisateur getRealisateur(Long id);
	List<Realisateur> getAllRealisateurs();

}
