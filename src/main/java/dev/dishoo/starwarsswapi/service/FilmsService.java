package dev.dishoo.starwarsswapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.dishoo.starwarsswapi.error.NotFoundObjectException;
import dev.dishoo.starwarsswapi.models.Films;
import dev.dishoo.starwarsswapi.repository.FilmsPagingRepository;
import dev.dishoo.starwarsswapi.repository.FilmsRepository;

@Service
public class FilmsService {
    
    @Autowired
    private FilmsRepository repo;

    @Autowired
    private FilmsPagingRepository pagingRepo;

    public Films save(Films films) {
        return repo.save(films);
    }

    public Page<Films> fetchAll(int currentPage, int pageSize) {
        return pagingRepo.findAll(PageRequest.of(currentPage, pageSize));
    }

    public Films findById(String filmsId) {
        return repo.findById(UUID.fromString(filmsId)).orElseThrow(() -> {
            throw new NotFoundObjectException("Films Not Found", Films.class.getName(), filmsId);
        });
    }

    public void deleteById(String filmsId) {
        repo.deleteById(UUID.fromString(filmsId));
    }

}
