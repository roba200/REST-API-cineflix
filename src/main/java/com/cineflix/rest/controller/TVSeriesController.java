package com.cineflix.rest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cineflix.rest.entity.TVSeries;
import com.cineflix.rest.service.SearchService;
import com.cineflix.rest.service.TVSeriesService;

@RestController
@RequestMapping("/series")
public class TVSeriesController {
    @Autowired
    private TVSeriesService service;
    
    @Autowired
    private SearchService searchService;

    @PostMapping("/saveseries")
    public TVSeries saveSeries(@RequestBody TVSeries series) {
        return service.saveSeries(series);
    }
    
    @GetMapping("/getseries")
    public List<TVSeries> findAllSeries(){
        return service.getSeries();
    }

    @GetMapping("/gettvseries")
    public List<TVSeries> getMoviesByCategory(@RequestParam String category) {
        return searchService.getTVSeriesByCategory(category);
    }

    @GetMapping("/search")
    public ResponseEntity<List<TVSeries>> searchTVSeries(@RequestParam String name) {
        List<TVSeries> tvSeries = searchService.searchTVSeriesByName(name);
        return ResponseEntity.ok(tvSeries);
    }
}
