package com.example.lld.snakeAndLadder.model;

public class Ladder extends Hurdle{
    public Ladder(int start, int end) {
        super(start, end);
    }
    @Override
    public void caught() {
        System.out.println("Lucky you, found a ladder");
    }
}
