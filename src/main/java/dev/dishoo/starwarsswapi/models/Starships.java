package dev.dishoo.starwarsswapi.models;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToMany;
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
public class Starships {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    
    private String name;
    private String model;
    private String starshipClass;
    private String manufacturer;
    private String costInCredits;
    private String lenght;
    private String crew;
    private String passengers;
    private String maxAtmospheringSpeed;
    private String hyperdriveRating;
    private String mglt;
    private String cargoCapacity;
    private String consumables;
    
    @ManyToMany(mappedBy = "starships")
    private Set <Films> films;

    @ManyToMany(mappedBy = "starships")
    private Set <People> pilots;

    private String url;

    //private String created;
    //private String edited;
}
//Search Fields: name , model