package com.cineflix.rest.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


import com.cineflix.rest.entity.TVSeries;

public interface TVSeriesRepository extends JpaRepository<TVSeries,Integer>{
    List<TVSeries> findByCategory(String category);

    List<TVSeries> findByNameContainingIgnoreCase(String name);
}
