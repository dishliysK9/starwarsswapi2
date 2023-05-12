package dev.dishoo.starwarsswapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.dishoo.starwarsswapi.error.NotFoundObjectException;
import dev.dishoo.starwarsswapi.models.Starships;
import dev.dishoo.starwarsswapi.repository.StarshipsPagingRepository;
import dev.dishoo.starwarsswapi.repository.StarshipsRepository;

@Service
public class StarshipsService {

    @Autowired
    private StarshipsRepository repo;

    @Autowired
    private StarshipsPagingRepository pagingRepo;

    

    public Starships save(Starships starships) {
        return repo.save(starships);
    }

    public Page<Starships> fetchAll(int currentPage, int pageSize) {
        return pagingRepo.findAll(PageRequest.of(currentPage, pageSize));
    }

    public Starships findById(String starshipsId) {
        return repo.findById(UUID.fromString(starshipsId)).orElseThrow(() -> {
            throw new NotFoundObjectException("Starships Not Found", Starships.class.getName(), starshipsId);
        });
    }

    public void deleteById(String starshipsId) {
        repo.deleteById(UUID.fromString(starshipsId));
    }
}
