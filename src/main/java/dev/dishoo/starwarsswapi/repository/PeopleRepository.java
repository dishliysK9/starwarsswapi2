package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.People;

public interface  PeopleRepository extends CrudRepository<People, UUID> {
    
}
