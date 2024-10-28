package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
public class TheaterManager {
    Map<City, List<Theater>> theaterMap = new HashMap<>();

    public List<Show> getShows(City city, Movie movie) {
        List<Show> shows = new ArrayList<>();
        for(Theater theater : this.theaterMap.get(city)) {
            shows.addAll(theater.shows.get(movie));
        }
        return shows;
    }

    public Booking createBooking(Show show, List<Seat> seats) {
        for(Seat seat : seats) {
            show.bookedSeats.add(seat.id);
        }
        Booking booking = new Booking(seats, show, 500 , PaymentStatus.PENDING);
        return booking;
    }
}
