package com.example.lld.ticTacToe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    public Symbol symbol;
    public String name;
    public boolean isWinner = false;

    public Player(Symbol symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String toString() {
        return this.name + " Winner!";
    }
}
