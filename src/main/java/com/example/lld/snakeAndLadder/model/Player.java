package com.example.lld.snakeAndLadder.model;

public class Player {
    public int position;
    public boolean isWon;
    public String name;
    public Player(int position, boolean isWon, String name) {
        this.position = position;
        this.isWon = isWon;
        this.name = name;
    }

    public void movePlayer(int newPosition) {
        this.position = newPosition;
    }
}
