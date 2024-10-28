package com.example.lld.bookMyShow;

import java.util.*;

public class BookMyShow {
    public static void main(String[] args) {
        System.out.println("Ready to create all objects");

        Movie movie1 = new Movie("Avengers", "English", "2hours", "Hero");
        Movie movie2 = new Movie("Bahubali", "Hindi", "3hours", "Action");

        MovieManager movieManager = new MovieManager();
        movieManager.movieMap.put(City.NEW_DELHI, Arrays.asList(movie1, movie2));
//        movieManager.movieMap.put(City.OLD_DELHI, Arrays.asList(movie1, movie2));

        Seat seat1 = new Seat(1, SeatType.REGULAR);
        Seat seat2 = new Seat(2, SeatType.GOLD);
        Seat seat3 = new Seat(3, SeatType.PLATINUM);

        Screen screen1 = new Screen(1, Arrays.asList(seat1, seat2, seat3));
        Screen screen2 = new Screen(2, Arrays.asList(seat1, seat2, seat3));
        Theater theater = new Theater();
        theater.city = City.NEW_DELHI;
        theater.screens = Arrays.asList(screen1, screen2);
        theater.location = "New Delhi complete location";

        List<Integer> bookedSeatsShow1 = new ArrayList<>();
        Show show1 = new Show(movie1, "2pm", "4pm", theater, screen1, bookedSeatsShow1);

        List<Integer> bookedSeatsShow2 = new ArrayList<>();
        Show show2 = new Show(movie2, "5pm", "8pm", theater, screen1, bookedSeatsShow2);

        Map<Movie, List<Show>> shows = new HashMap<>();
        shows.put(movie1, Arrays.asList(show1));
        shows.put(movie2, Arrays.asList(show2));
        theater.shows = shows;

        TheaterManager theaterManager = new TheaterManager();
        theaterManager.theaterMap.put(City.NEW_DELHI, Arrays.asList(theater));

        System.out.println("Till here we have filled our DB");

        List<Movie> movies = movieManager.getMovies(City.NEW_DELHI);
        for(Movie movie : movies) {
            System.out.println(movie);
        }

        List<Show> showsOfMyMovie = theaterManager.getShows(City.NEW_DELHI, movies.get(0));
        for(Show show : showsOfMyMovie) {
            System.out.println(show);
        }

        Show selectedShow = showsOfMyMovie.get(0);
        System.out.println("Selected show :" + selectedShow);

        Booking booking = theaterManager.createBooking(selectedShow, Arrays.asList(selectedShow.screen.seats.get(0), selectedShow.screen.seats.get(1)));
        System.out.println(booking.price + booking.paymentStatus.toString() + booking.bookedSeats + booking.show);
        booking.paymentStatus = PaymentStatus.COMPLETED;


    }
}
