package dev.dishoo.starwarsswapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

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
}
