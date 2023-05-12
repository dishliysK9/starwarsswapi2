package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import dev.dishoo.starwarsswapi.models.Vehicles;

public interface  VehiclesPagingRepository extends CrudRepository<Vehicles, UUID>{
    
}
