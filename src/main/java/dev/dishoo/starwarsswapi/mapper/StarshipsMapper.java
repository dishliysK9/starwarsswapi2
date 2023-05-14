package dev.dishoo.starwarsswapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import dev.dishoo.starwarsswapi.models.Starships;
import dev.dishoo.starwarsswapi.web.dto.StarshipsCreateRequest;
import dev.dishoo.starwarsswapi.web.dto.StarshipsResponse;
import dev.dishoo.starwarsswapi.web.dto.StarshipsUpdateRequest;

@Mapper
public interface StarshipsMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pilots", ignore = true)
    @Mapping(target = "films", ignore = true)
    Starships modelFromCreateRequest(StarshipsCreateRequest starshipsCreateDto);

    StarshipsResponse responseFromModel(Starships starships);

    @Mapping(target = "pilots", ignore = true)
    @Mapping(target = "films", ignore = true)
    void updateModelFromDto(StarshipsUpdateRequest starshipUpdateDto, @MappingTarget Starships starships);
    
}
