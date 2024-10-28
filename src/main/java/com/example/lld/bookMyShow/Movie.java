package com.example.lld.bookMyShow;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    String movieName;
    String language;
    String duration;
    String genre;

    public String toString() {
        return this.movieName +" "+ this.duration + " " + this.language + " " + this.genre;
    }
}
