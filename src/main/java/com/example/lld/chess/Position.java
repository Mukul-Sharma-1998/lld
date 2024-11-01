package com.example.lld.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Position {
    private Color color;
    private Integer row;
    private Integer column;
    private Piece piece;
}
