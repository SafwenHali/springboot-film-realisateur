
//RealisateurServiceImp.java
package com.safwen.film.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safwen.film.entities.Realisateur;
import com.safwen.film.repos.RealisateurRepository;


@Service
public class RealisateurServiceImpl implements RealisateurService {

  @Autowired
  RealisateurRepository RealisateurRepository;

  @Override
  public Realisateur saveRealisateur(Realisateur r) {
    return RealisateurRepository.save(r);
  }

  @Override
  public Realisateur updateRealisateur(Realisateur r) {
    return RealisateurRepository.save(r);
  }

  @Override
  public void deleteRealisateur(Realisateur r) {
    RealisateurRepository.delete(r);
  }

  @Override
  public void deleteRealisateurById(Long id) {
    RealisateurRepository.deleteById(id);
  }

  @Override
  public Realisateur getRealisateur(Long id) {
    return RealisateurRepository.findById(id).get();
  }

  @Override
  public List<Realisateur> getAllRealisateurs() {
    return RealisateurRepository.findAll();
  }

	
}
