package dev.dishoo.starwarsswapi.models;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    
    @ManyToMany(mappedBy = "species")
    private Set<People> people;

    @ManyToMany(mappedBy = "species")
    private Set<Films> films;
    
    private String url;

    
   //private String created;
   //private String edited;
}
//Search Fields: name
