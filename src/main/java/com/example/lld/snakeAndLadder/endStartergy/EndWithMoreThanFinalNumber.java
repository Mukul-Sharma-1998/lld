package com.example.lld.snakeAndLadder.endStartergy;

public class EndWithMoreThanFinalNumber implements EndStratergy {
    @Override
    public boolean isAllowed(int size, int value) {
        return value >= size;
    }
}
