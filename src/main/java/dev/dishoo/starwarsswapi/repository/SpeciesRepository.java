package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Species;

public interface  SpeciesRepository extends CrudRepository<Species, UUID>{
    
}
