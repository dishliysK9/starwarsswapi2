package dev.dishoo.starwarsswapi.web.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpeciesResponse {
    

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
    
    private String url;
}
