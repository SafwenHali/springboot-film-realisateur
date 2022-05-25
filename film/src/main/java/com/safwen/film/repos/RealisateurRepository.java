package com.safwen.film.repos;

import com.safwen.film.entities.Realisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface RealisateurRepository extends JpaRepository<Realisateur, Long> {

}