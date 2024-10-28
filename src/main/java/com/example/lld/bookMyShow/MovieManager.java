package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
public class MovieManager {
    Map<City, List<Movie>> movieMap = new HashMap<>();

    public List<Movie> getMovies(City city) {
        return movieMap.get(city);
    }

}
