package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Films;

public interface FilmsRepository extends CrudRepository<Films, UUID> {
    
}
