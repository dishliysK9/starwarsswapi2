package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.Planets;

public interface  PlanetsPagingRepository extends PagingAndSortingRepository<Planets, UUID>{
    
}
