package edu.sofia.ExamenRestJpaCine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "reparto")
public class Reparto {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reparto_id;

    @Column(nullable = false, length = 100)
    private String personaje;

    @Column
    private Double salario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id")
    private Actor actor;

    public Reparto() {
    }

    public Reparto(String personaje, Double salario, Pelicula pelicula, Actor actor) {
        this.personaje = personaje;
        this.salario = salario;
        this.pelicula = pelicula;
        this.actor = actor;
    }

    public Long getReparto_id() {
        return reparto_id;
    }

    public void setReparto_id(Long reparto_id) {
        this.reparto_id = reparto_id;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    

    



}
