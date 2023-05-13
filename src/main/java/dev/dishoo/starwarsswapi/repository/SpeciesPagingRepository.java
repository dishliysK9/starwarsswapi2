package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.Species;

public interface  SpeciesPagingRepository extends PagingAndSortingRepository<Species, UUID>{
    
}
