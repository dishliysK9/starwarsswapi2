package dev.dishoo.starwarsswapi.models;

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

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "people_species", joinColumns = @JoinColumn(name = "people_id"), inverseJoinColumns = @JoinColumn(name = "species_id"))
        @JsonIgnoreProperties("people")
        private Set<Species> species;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "people_starships", joinColumns = @JoinColumn(name = "people_id"), inverseJoinColumns = @JoinColumn(name = "starships_id"))
        @JsonIgnoreProperties("pilots")
        private Set<Starships> starships;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "people_vehicles", joinColumns = @JoinColumn(name = "people_id"), inverseJoinColumns = @JoinColumn(name = "vehicles_id"))
        @JsonIgnoreProperties("pilots")
        private Set<Vehicles> vehicles;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "people_planets", joinColumns = @JoinColumn(name = "people_id"), inverseJoinColumns = @JoinColumn(name = "planets_id"))
        @JsonIgnoreProperties("residents")
        private Set<Planets> planets;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "people_films", joinColumns = @JoinColumn(name = "people_id"), inverseJoinColumns = @JoinColumn(name = "films_id"))
        @JsonIgnoreProperties("people")
        private Set<Films> films;

        private String url;

        // private String created;
        // private String edited;
}
// Search Fields: namesss