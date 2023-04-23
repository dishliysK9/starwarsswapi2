package dev.dishoo.starwarsswapi.models;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicles {
    
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

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

    //private String created;
    //private String edited;
}
//Search Fields: name , model

