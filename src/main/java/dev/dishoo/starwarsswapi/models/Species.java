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
public class Species {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String averageLifespan;

    private String eyeColors;
    private String hairColors;
    private String skinColors;

    private String language;
    private String homeWorld;

    private List<String> peopleUrls;
    private List<String> filmsUrls;
    
    private String url;

    
   //private String created;
   //private String edited;
}
//Search Fields: name
