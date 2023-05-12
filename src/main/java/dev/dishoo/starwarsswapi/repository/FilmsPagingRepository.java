package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Films;

public interface FilmsPagingRepository extends CrudRepository<Films, UUID> {
    
}
