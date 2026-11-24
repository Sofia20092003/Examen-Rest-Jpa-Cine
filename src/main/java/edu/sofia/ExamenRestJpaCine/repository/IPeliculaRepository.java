package edu.sofia.ExamenRestJpaCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.ExamenRestJpaCine.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long>{

}
