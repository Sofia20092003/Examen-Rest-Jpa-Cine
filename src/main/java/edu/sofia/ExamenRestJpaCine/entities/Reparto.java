package edu.sofia.ExamenRestJpaCine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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



}
