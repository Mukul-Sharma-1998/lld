package com.example.lld.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Board {
    private Position[][] positions;
    private Integer rows;
    private Integer columns;


    public void move(Position initialPosition, Position destinationPosition) {

    }
}
