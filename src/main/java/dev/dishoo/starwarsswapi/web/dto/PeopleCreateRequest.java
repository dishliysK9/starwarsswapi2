package dev.dishoo.starwarsswapi.web.dto;

import java.util.Set;

import dev.dishoo.starwarsswapi.validation.ValidUrl;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PeopleCreateRequest {
    

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

    @ValidUrl(message = "URLs shouldn't be longer than 39 charakters")
    private String url;
}
