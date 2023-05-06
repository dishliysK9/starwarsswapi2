package dev.dishoo.starwarsswapi.models;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class People {
    
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    
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

    //private String created;
    //private String edited;
}
//Search Fields: name