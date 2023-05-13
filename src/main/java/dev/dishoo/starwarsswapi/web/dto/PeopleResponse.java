package dev.dishoo.starwarsswapi.web.dto;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PeopleResponse {
    
    //no id
    
    private String name;
    private String birthYear;
    private String eyeColor;
    private String gender;
    private String hairColor;
    private String height;
    private String mass;
    private String skinColor;
    private String homeWorld;
   
    private Set <String> filmsUrls;
    private Set <String> speciesUrls;
    private Set <String> starshipsUrls;
    private Set <String> vehiclesUrls;

    private String url;
}
