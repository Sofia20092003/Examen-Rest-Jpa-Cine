package edu.sofia.ExamenRestJpaCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.ExamenRestJpaCine.entities.Pelicula;
import java.util.List;


public interface IPeliculaRepository extends JpaRepository<Pelicula, Long>{

    public List<Pelicula> findByTitulo(String titulo);

    public List<Pelicula> findByAnio(Integer anio);


}
