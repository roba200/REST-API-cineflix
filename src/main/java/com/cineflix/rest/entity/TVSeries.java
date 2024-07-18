package com.cineflix.rest.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TVSERIES")

public class TVSeries {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String rating;
    private String category;
    private String posterUrl;
    private String backdropUrl;
    private String videoUrl;
    private String year;
}
