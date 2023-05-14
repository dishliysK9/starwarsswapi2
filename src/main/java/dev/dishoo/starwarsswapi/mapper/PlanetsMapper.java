package dev.dishoo.starwarsswapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Planets;
import dev.dishoo.starwarsswapi.web.dto.PlanetsCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.PlanetsResponse;
import dev.dishoo.starwarsswapi.web.dto.PlanetsUpdateRequest;

@Mapper
public interface PlanetsMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "residents", ignore = true)
    @Mapping(target = "films", ignore = true)
    Planets modelFromCreateRequest(PlanetsCreateRequest planetsCreateDto);

    PlanetsResponse responseFromModel(Planets planets);

    @Mapping(target = "residents", ignore = true)
    @Mapping(target = "films", ignore = true)
    void updateModelFromDto(PlanetsUpdateRequest planetsUpdateDto, @MappingTarget Planets planets);
}
