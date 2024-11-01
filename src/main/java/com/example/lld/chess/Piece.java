package com.example.lld.chess;

import com.example.lld.chess.movement.MovementStratergy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Piece {
    private PieceName pieceName;
    private Color pieceColor;
    private boolean isAlive;
    private Position piecePosition;
    private Player player;
    private MovementStratergy movementStratergy;

    private void move(Position initialPosition, Position destinationPosition) {

    }
}
