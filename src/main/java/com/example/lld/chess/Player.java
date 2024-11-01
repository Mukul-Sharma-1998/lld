package com.example.lld.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {
    private String name;
    private Color color;
    private boolean turn;
    private boolean isWon;
    private List<Piece> alivePieces;
    private List<Piece> deadPieces;
}
