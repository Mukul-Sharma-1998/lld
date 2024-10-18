package com.example.lld.snakeAndLadder.startStratergy;

public class StartWithOneSix implements StartStratergy {
    @Override
    public boolean isallowed(int value) {
        return value == 1 || value == 6;
    }
}
