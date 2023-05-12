package dev.dishoo.starwarsswapi.web.dto;

import java.util.Date;
import java.util.List;

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

    private List<String> speciesUrls;
    private List<String> starshipsUrls;
    private List<String> vehiclesUrls;
    private List<String> charactersUrls;
    private List<String> planetsUrls;
    
    private String url;
}