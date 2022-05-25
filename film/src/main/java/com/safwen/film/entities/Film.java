package com.safwen.film.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Film {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idFilm;

  private String nomFilm;
  private String genreFilm;
  private Date dateCreation;
  

  @ManyToOne
  private Realisateur realisateur ;

  
}