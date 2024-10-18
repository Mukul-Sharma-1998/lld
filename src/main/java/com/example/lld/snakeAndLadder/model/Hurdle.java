package com.example.lld.snakeAndLadder.model;

public abstract class Hurdle {
    public int start;
    public int end;

    public Hurdle(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public abstract void caught();
}
