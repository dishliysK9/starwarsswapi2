package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.Films;

public interface FilmsPagingRepository extends PagingAndSortingRepository<Films, UUID> {
    
}
