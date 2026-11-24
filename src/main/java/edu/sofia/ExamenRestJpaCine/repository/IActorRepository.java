package edu.sofia.ExamenRestJpaCine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sofia.ExamenRestJpaCine.entities.Actor;

public interface IActorRepository extends JpaRepository<Actor, Long>{

}
