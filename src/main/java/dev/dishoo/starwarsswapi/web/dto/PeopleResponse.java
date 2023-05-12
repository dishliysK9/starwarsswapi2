package dev.dishoo.starwarsswapi.web.dto;

import java.util.List;

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
   
    private List <String> filmsUrls;
    private List <String> speciesUrls;
    private List <String> starshipsUrls;
    private List <String> vehiclesUrls;

    private String url;
}
