package dev.dishoo.starwarsswapi.models;

import java.util.Date;
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
public class Films {
    
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String title;
    private String episodeId;
    private String openingCrawl;
    private String director;
    private String producer;

    private Date releaseDate;

    private List<String> speciesUrls;
    private List<String> starshipsUrls;
    private List<String> vehiclesUrls;
    private List<String> charactersUrls;
    private List<String> planetsUrls;
    
    private String url;

    //private String created;
    //private String edited;


}
//Search fields: title