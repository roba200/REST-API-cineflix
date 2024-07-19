package com.cineflix.rest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cineflix.rest.entity.Movie;
import com.cineflix.rest.service.MovieService;
import com.cineflix.rest.service.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/movie")
public class MovieController {
    
    @Autowired
    private MovieService service;

    @Autowired
    private SearchService searchService;

    @PostMapping("/savemovie")
    public Movie saveMovie(@RequestBody Movie movie) {
        return service.saveMovie(movie);
    }
    
    @GetMapping("/movies")
    public List<Movie> findAllMovies(){
        return service.getMovies();
    }

    @GetMapping("/getmovies")
    public List<Movie> getMoviesByCategory(@RequestParam String category) {
        return searchService.getMoviesByCategory(category);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovies(@RequestParam String name) {
        List<Movie> movies = searchService.searchMoviesByName(name);
        return ResponseEntity.ok(movies);
    }

}
