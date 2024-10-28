package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    List<Screen> screens;
    Map<Movie, List<Show>> shows;
    City city;
    String location;
}
