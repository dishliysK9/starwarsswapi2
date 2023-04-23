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
public class Planets {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String name;
    private String diameter;
    private String rotationPeriod;
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surfaceWater;
    private String residents;

    private List<String> residentsUrls;
    private List<String> filmsUrls;
    
    private String url;

   //private String created;
    //private String edited;
}
//Search Fields: name , model