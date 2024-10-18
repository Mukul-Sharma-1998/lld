package com.example.lld.snakeAndLadder.model;

public class NoHurdle extends Hurdle {
    public NoHurdle(int start, int end) {
        super(start, end);
    }

    @Override
    public void caught() {
        System.out.println("You are safe");
    }
}
