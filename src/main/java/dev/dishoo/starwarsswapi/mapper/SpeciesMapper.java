package dev.dishoo.starwarsswapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Species;
import dev.dishoo.starwarsswapi.web.dto.SpeciesCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.SpeciesResponse;
import dev.dishoo.starwarsswapi.web.dto.SpeciesUpdateRequest;

@Mapper
public interface SpeciesMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "people", ignore = true)
    @Mapping(target = "films", ignore = true)
    Species modelFromCreateRequest(SpeciesCreateRequest speciesCreateDto);

    SpeciesResponse responseFromModel(Species species);

    
    @Mapping(target = "people", ignore = true)
    @Mapping(target = "films", ignore = true)
    void updateModelFromDto(SpeciesUpdateRequest speciesUpdateDto, @MappingTarget Species species);
}
