package com.example.lld.snakeAndLadder.model;

public class Snake extends Hurdle{
    public Snake(int start, int end) {
        super(start, end);
    }
    @Override
    public void caught() {
        System.out.println("Oh, you got caught by snake");
    }
}
