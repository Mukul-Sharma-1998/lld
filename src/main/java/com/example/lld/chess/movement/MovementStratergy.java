package com.example.lld.chess.movement;

import com.example.lld.chess.Position;

public interface MovementStratergy {
    boolean movement(Position initialPosition, Position destinationPosition);
}
