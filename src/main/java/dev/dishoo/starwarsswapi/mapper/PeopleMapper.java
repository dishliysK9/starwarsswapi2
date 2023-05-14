package dev.dishoo.starwarsswapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.People;
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

    
}
