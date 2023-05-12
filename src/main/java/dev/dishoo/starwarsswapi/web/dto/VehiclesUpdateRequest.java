package dev.dishoo.starwarsswapi.web.dto;

import java.util.List;

import dev.dishoo.starwarsswapi.validation.ValidUrl;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VehiclesUpdateRequest {
    

    private String name;
    private String model;
    private String vehicleClass;
    private String manufacturer;
    private String costInCredits;
    private String crew;
    private String passengers;
    private String maxAtmospheringSpeed;
    private String mglt;
    private String cargoCapacity;
    private String consumables;
   
    private List <String> filmsUrls;
    private List <String> pilotsUrls;

    @ValidUrl(message = "URLs shouldn't be longer than 39 charakters")
    private String url;
}
