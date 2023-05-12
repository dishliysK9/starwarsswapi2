package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Vehicles;

public interface  VehiclesRepository extends CrudRepository<Vehicles, UUID> {
    
}
