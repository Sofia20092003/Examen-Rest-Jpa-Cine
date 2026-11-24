package edu.sofia.ExamenRestJpaCine.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actor_id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 60)
    private String nacionalidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Reparto> reparto = new ArrayList<>();

    public Actor() {
    }

    public Actor(String nombre, String nacionalidad, List<Reparto> reparto) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.reparto = reparto;
    }

    public Long getActor_id() {
        return actor_id;
    }

    public void setActor_id(Long actor_id) {
        this.actor_id = actor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Reparto> getReparto() {
        return reparto;
    }

    public void setReparto(List<Reparto> reparto) {
        this.reparto = reparto;
    }
    
}
