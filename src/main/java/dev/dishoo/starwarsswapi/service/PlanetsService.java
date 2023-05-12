package dev.dishoo.starwarsswapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.dishoo.starwarsswapi.error.NotFoundObjectException;
import dev.dishoo.starwarsswapi.models.Planets;
import dev.dishoo.starwarsswapi.repository.PlanetsPagingRepository;
import dev.dishoo.starwarsswapi.repository.PlanetsRepository;

@Service
public class PlanetsService {

    @Autowired
    private PlanetsRepository repo;

    @Autowired
    private PlanetsPagingRepository pagingRepo;

    

    public Planets save(Planets planets) {
        return repo.save(planets);
    }

    public Page<Planets> fetchAll(int currentPage, int pageSize) {
        return pagingRepo.findAll(PageRequest.of(currentPage, pageSize));
    }

    public Planets findById(String planetsId) {
        return repo.findById(UUID.fromString(planetsId)).orElseThrow(() -> {
            throw new NotFoundObjectException("Planets Not Found", Planets.class.getName(), planetsId);
        });
    }

    public void deleteById(String planetsId) {
        repo.deleteById(UUID.fromString(planetsId));
    }
}
