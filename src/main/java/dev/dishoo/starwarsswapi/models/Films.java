package dev.dishoo.starwarsswapi.models;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "films_species", joinColumns = @JoinColumn(name = "films_id"), inverseJoinColumns = @JoinColumn(name = "species_id"))
        @JsonIgnoreProperties("films")
        private Set<Species> species;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "films_starships", joinColumns = @JoinColumn(name = "films_id"), inverseJoinColumns = @JoinColumn(name = "starships_id"))
        @JsonIgnoreProperties("films")
        private Set<Starships> starships;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "films_vehicles", joinColumns = @JoinColumn(name = "films_id"), inverseJoinColumns = @JoinColumn(name = "vehicles_id"))
        @JsonIgnoreProperties("films")
        private Set<Vehicles> vehicles;

        @ManyToMany(mappedBy = "films")
        private Set<People> people;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "films_planets", joinColumns = @JoinColumn(name = "films_id"), inverseJoinColumns = @JoinColumn(name = "planets_id"))
        @JsonIgnoreProperties("films")
        private Set<Planets> planets;

        private String url;

        // private String created;
        // private String edited;

}
// Search fields: title