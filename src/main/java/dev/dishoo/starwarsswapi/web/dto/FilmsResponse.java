package dev.dishoo.starwarsswapi.web.dto;

import java.util.Date;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilmsResponse {
    

    private String title;
    private String episodeId;
    private String openingCrawl;
    private String director;
    private String producer;

    private Date releaseDate;

    private Set<String> speciesUrls;
    private Set<String> starshipsUrls;
    private Set<String> vehiclesUrls;
    private Set<String> charactersUrls;
    private Set<String> planetsUrls;

    
    private String url;
}
