package com.cineflix.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineflix.rest.entity.Movie;
import com.cineflix.rest.entity.TVSeries;
import com.cineflix.rest.repository.MovieRepository;
import com.cineflix.rest.repository.TVSeriesRepository;

@Service
public class SearchService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TVSeriesRepository tvSeriesRepository;
    
    public List<Movie> getMoviesByCategory(String category) {
        return movieRepository.findByCategory(category);
    }

    public List<Movie> searchMoviesByName(String name) {
        return movieRepository.findByNameContainingIgnoreCase(name);
    }

    public List<TVSeries> getTVSeriesByCategory(String category) {
        return tvSeriesRepository.findByCategory(category);
    }

    public List<TVSeries> searchTVSeriesByName(String name) {
        return tvSeriesRepository.findByNameContainingIgnoreCase(name);
    }
}
