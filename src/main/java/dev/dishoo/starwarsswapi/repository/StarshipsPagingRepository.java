package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.Starships;

public interface  StarshipsPagingRepository extends PagingAndSortingRepository<Starships, UUID> {
    
}
