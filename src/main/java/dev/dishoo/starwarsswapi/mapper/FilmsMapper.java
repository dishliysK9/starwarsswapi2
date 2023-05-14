package dev.dishoo.starwarsswapi.mapper;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Films;
import dev.dishoo.starwarsswapi.web.dto.FilmsCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.FilmsResponse;
import dev.dishoo.starwarsswapi.web.dto.FilmsUpdateRequest;

@Mapper
public interface FilmsMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "people", ignore = true)
    @Mapping(target = "planets", ignore = true)
    @Mapping(target = "species", ignore = true)
    @Mapping(target = "starships", ignore = true)
    @Mapping(target = "vehicles", ignore = true)
    Films modelFromCreateRequest(FilmsCreateRequest filmsleCreateDto);

    FilmsResponse responseFromModel(Films films);

    @Mapping(target = "people", ignore = true)
    @Mapping(target = "planets", ignore = true)
    @Mapping(target = "species", ignore = true)
    @Mapping(target = "starships", ignore = true)
    @Mapping(target = "vehicles", ignore = true)
    void updateModelFromDto(FilmsUpdateRequest filmsUpdateDto, @MappingTarget Films films);

    //Map From Set<Films> "films" to Set<String> "filmsUrls"
    static Set<String> modelToUrl(Set<People> people) {
        // if (people == null) {
        // return null;
        // }
        Set<String> peopleUrls = new HashSet<String>();
        for (People person : people) {
            peopleUrls.add("http://localhost:8080/starwarsswapi/people/" + person.getId());
        }
        return peopleUrls;
    }

    static Set<String> modelToUrl(Set<Planets> planets) {
        // if (planets == null) {
        // return null;
        // }
        Set<String> planetUrls = new HashSet<String>();
        for (Planets planet : planets) {
            planetUrls.add("http://localhost:8080/starwarsswapi/planets/" + planet.getId());
        }
        return planetUrls;
    }
    

    static Set<String> modelToUrl(Set<Species> species) {
        // if (species == null) {
        // return null;
        // }
        Set<String> speciesUrls = new HashSet<String>();
        for (Species specie : species) {
            speciesUrls.add("http://localhost:8080/starwarsswapi/species/" + specie.getId());
        }
        return speciesUrls;
    }

    static Set<String> modelToUrl(Set<Starships> starships) {
        // if (starships == null) {
        // return null;
        // }
        Set<String> starshipUrls = new HashSet<String>();
        for (Starships starship : starships) {
            starshipUrls.add("http://localhost:8080/starwarsswapi/starships/" + starship.getId());
        }
        return starshipUrls;
    }
    static Set<String> modelToUrl(Set<Vehicles> vehicles) {
    // if (vehicles == null) {
    // return null;
    // }
    Set<String> vehicleUrls = new HashSet<String>();
    for (Vehicles vehicle : vehicles) {
        vehicleUrls.add("http://localhost:8080/starwarsswapi/vehicles/" + vehicle.getId());
    }
    return vehicleUrls;
}

    
}

