package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Planets;

public interface  PlanetsRepository extends CrudRepository<Planets, UUID>{
    
}
