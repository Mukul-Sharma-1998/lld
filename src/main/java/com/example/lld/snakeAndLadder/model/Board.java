package com.example.lld.snakeAndLadder.model;

import java.util.List;

public class Board {
    public int size;
    public Hurdle[] hurdles;

    public Board(int size, List<Hurdle> hurdles) {
        this.size = size;
        this.hurdles = new Hurdle[this.size];

        for(Hurdle hurdle : hurdles) {
            this.hurdles[hurdle.start] = hurdle;
        }


        for(int i=0; i<this.size; i++) {
            if(this.hurdles[i] == null) {
                this.hurdles[i] = new NoHurdle(i, i);
            }
        }
    }

    public Hurdle getHurdle(int i) {
        return hurdles[i];
    }
}
