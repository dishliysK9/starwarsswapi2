package dev.dishoo.starwarsswapi.mapper;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Films;
import dev.dishoo.starwarsswapi.models.People;
import dev.dishoo.starwarsswapi.models.Planets;
import dev.dishoo.starwarsswapi.models.Species;
import dev.dishoo.starwarsswapi.models.Starships;
import dev.dishoo.starwarsswapi.models.Vehicles;
import dev.dishoo.starwarsswapi.web.dto.PeopleCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.PeopleResponse;
import dev.dishoo.starwarsswapi.web.dto.PeopleUpdateRequest;

@Mapper
public interface PeopleMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "films", ignore = true)
    @Mapping(target = "planets", ignore = true)
    @Mapping(target = "species", ignore = true)
    @Mapping(target = "starships", ignore = true)
    @Mapping(target = "vehicles", ignore = true)
    People modelFromCreateRequest(PeopleCreateRequest peopleCreateDto);

    PeopleResponse responseFromModel(People people);
    
    @Mapping(target = "films", ignore = true)
    @Mapping(target = "planets", ignore = true)
    @Mapping(target = "species", ignore = true)
    @Mapping(target = "starships", ignore = true)
    @Mapping(target = "vehicles", ignore = true)
    void updateModelFromDto(PeopleUpdateRequest peopleUpdateDto, @MappingTarget People people);

    static Set<String> modelToUrl (Set<Films> films){

        // if (films == null){
        // return null;
        // }
        Set<String> filmsUrls = new HashSet<String>();
        for(Films film:films){
            filmsUrls.add("http://localhost:8080/starwarsswapi/films/" + film.getId());
         }
         return filmsUrls;
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
