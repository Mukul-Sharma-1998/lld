package com.example.lld.snakeAndLadder.endStartergy;

public class EndWithFinalNumber implements EndStratergy {
    @Override
    public boolean isAllowed(int size, int value) {
        return size == value;
    }
}
