package dev.dishoo.starwarsswapi.web.dto;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlanetsResponse {

    
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
    
    private String url;
}
