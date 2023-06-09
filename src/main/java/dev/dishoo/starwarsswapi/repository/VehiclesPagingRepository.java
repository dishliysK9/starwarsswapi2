package dev.dishoo.starwarsswapi.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.dishoo.starwarsswapi.models.Vehicles;

public interface  VehiclesPagingRepository extends PagingAndSortingRepository<Vehicles, UUID>{
    
}
