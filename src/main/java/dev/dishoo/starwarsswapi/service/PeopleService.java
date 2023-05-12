package dev.dishoo.starwarsswapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.dishoo.starwarsswapi.error.NotFoundObjectException;
import dev.dishoo.starwarsswapi.models.People;
import dev.dishoo.starwarsswapi.repository.PeoplePagingRepository;
import dev.dishoo.starwarsswapi.repository.PeopleRepository;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository repo;

    @Autowired
    private PeoplePagingRepository pagingRepo;

    

    public People save(People people) {
        return repo.save(people);
    }

    public Page<People> fetchAll(int currentPage, int pageSize) {
        return pagingRepo.findAll(PageRequest.of(currentPage, pageSize));
    }

    public People findById(String peopleId) {
        return repo.findById(UUID.fromString(peopleId)).orElseThrow(() -> {
            throw new NotFoundObjectException("People Not Found", People.class.getName(), peopleId);
        });
    }

    public void deleteById(String peopleId) {
        repo.deleteById(UUID.fromString(peopleId));
    }
}
