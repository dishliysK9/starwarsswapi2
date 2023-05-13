package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.People;

public interface PeoplePagingRepository extends PagingAndSortingRepository<People, UUID>{
    
}
