package com.cineflix.rest.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineflix.rest.entity.Movie;
import com.cineflix.rest.repository.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public Movie saveMovie(Movie movie){
        return repository.save(movie);
    }

    public List<Movie> getMovies(){
        return repository.findAll();
    }

    public List<Movie> getMoviesByCategory(String category) {
        return repository.findByCategory(category);
    }

    public List<Movie> searchMoviesByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}
