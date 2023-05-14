package dev.dishoo.starwarsswapi.mapper;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Films;
import dev.dishoo.starwarsswapi.models.People;
import dev.dishoo.starwarsswapi.models.Vehicles;
import dev.dishoo.starwarsswapi.web.dto.VehiclesCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.VehiclesResponse;
import dev.dishoo.starwarsswapi.web.dto.VehiclesUpdateRequest;

@Mapper
public interface VehiclesMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pilots", ignore = true)
    @Mapping(target = "films", ignore = true)
    Vehicles modelFromCreateRequest (VehiclesCreateRequest vehiclesCreateDto);

    VehiclesResponse responseFromModel (Vehicles vehicles);

    @Mapping(target = "pilots", ignore = true)
    @Mapping(target = "films", ignore = true)
    void updateModelFromDto(VehiclesUpdateRequest vehiclesUpdateDto, @MappingTarget Vehicles vehicles);

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
}
