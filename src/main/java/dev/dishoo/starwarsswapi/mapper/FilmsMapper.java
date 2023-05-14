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

    String mapSingle(Films films);

    default Set<String> modelToUrl (Set<Films> films){

        if (films == null){
        return null;
        }
        Set<String> filmsUrls = new HashSet<String>();
        for(Films film:films){
            String url = mapSingle(film);
            filmsUrls.add(url);
         }
         return filmsUrls;
    }
}

