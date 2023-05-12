package dev.dishoo.starwarsswapi.web.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VehiclesResponse {
    

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

    
    private String url;
}
