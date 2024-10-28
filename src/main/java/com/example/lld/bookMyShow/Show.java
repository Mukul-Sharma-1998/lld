package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Show {
    Movie movie;
    String startTime;
    String endTime;
    Theater theater;
    Screen screen;
    List<Integer> bookedSeats;

    public String toString() {
        return this.movie.movieName + this.startTime + this.endTime;
    }
}
