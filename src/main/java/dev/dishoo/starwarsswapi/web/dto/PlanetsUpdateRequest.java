package dev.dishoo.starwarsswapi.web.dto;

import java.util.Set;

import dev.dishoo.starwarsswapi.validation.ValidUrl;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlanetsUpdateRequest {
    

    private String name;
    private String diameter;
    private String rotationPeriod;
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surfaceWater;
    

    private Set<String> residentsUrls;
    private Set<String> filmsUrls;
    
    @ValidUrl(message = "URLs shouldn't be longer than 39 charakters")
    private String url;
}
