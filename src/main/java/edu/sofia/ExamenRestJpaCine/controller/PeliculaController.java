package edu.sofia.ExamenRestJpaCine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.sofia.ExamenRestJpaCine.service.interfaces.IPeliculaService;

@RestController 
@RequestMapping("/api/pelicula") 
public class PeliculaController {

    @Autowired 
    private IPeliculaService peliculaService;

    

}
