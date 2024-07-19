package com.cineflix.rest.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineflix.rest.entity.TVSeries;
import com.cineflix.rest.repository.TVSeriesRepository;

@Service
public class TVSeriesService {
    @Autowired
    private TVSeriesRepository repository;

    public TVSeries saveSeries(TVSeries series){
        return repository.save(series);
    }

    public List<TVSeries> getSeries(){
        return repository.findAll();
    }

    
}
