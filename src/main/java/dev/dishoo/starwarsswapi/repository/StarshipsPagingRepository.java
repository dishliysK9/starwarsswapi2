package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Starships;

public interface  StarshipsPagingRepository extends CrudRepository<Starships, UUID> {
    
}
