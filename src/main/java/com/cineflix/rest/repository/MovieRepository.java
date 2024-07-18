package com.cineflix.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cineflix.rest.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer>{
    List<Movie> findByCategory(String category);

    List<Movie> findByNameContainingIgnoreCase(String name);
    
}
