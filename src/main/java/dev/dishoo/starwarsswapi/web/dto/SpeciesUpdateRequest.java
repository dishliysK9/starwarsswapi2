package dev.dishoo.starwarsswapi.web.dto;

import java.util.List;

import dev.dishoo.starwarsswapi.validation.ValidUrl;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpeciesUpdateRequest {
    

    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String averageLifespan;

    private String eyeColors;
    private String hairColors;
    private String skinColors;

    private String language;
    private String homeWorld;

    private List<String> peopleUrls;
    private List<String> filmsUrls;
    
    @ValidUrl(message = "URLs shouldn't be longer than 39 charakters")
    private String url;
}
