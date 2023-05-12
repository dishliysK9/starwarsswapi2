package dev.dishoo.starwarsswapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.dishoo.starwarsswapi.error.NotFoundObjectException;
import dev.dishoo.starwarsswapi.models.Vehicles;
import dev.dishoo.starwarsswapi.repository.VehiclesPagingRepository;
import dev.dishoo.starwarsswapi.repository.VehiclesRepository;


@Service
public class VehiclesService {

    @Autowired
    private VehiclesRepository repo;

    @Autowired
    private VehiclesPagingRepository pagingRepo;

    

    public Vehicles save(Vehicles vehicles) {
        return repo.save(vehicles);
    }

    public Page<Vehicles> fetchAll(int currentPage, int pageSize) {
        return pagingRepo.findAll(PageRequest.of(currentPage, pageSize));
    }

    public Vehicles findById(String vehiclesId) {
        return repo.findById(UUID.fromString(vehiclesId)).orElseThrow(() -> {
            throw new NotFoundObjectException("Vehicles Not Found", Vehicles.class.getName(), vehiclesId);
        });
    }

    public void deleteById(String vehiclesId) {
        repo.deleteById(UUID.fromString(vehiclesId));
    }
}
