package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Screen {
    int screenId;
    List<Seat> seats;
}
