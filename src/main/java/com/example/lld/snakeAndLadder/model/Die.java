package com.example.lld.snakeAndLadder.model;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Random;

public class Die {
    public int faces;
    public List<Integer> faceValues;
    public Random random = new Random();

    public Die(int faces, List<Integer> faceValues) {
        this.faces = faces;
        this.faceValues = faceValues;
    }

    public int rollDie() {
        return this.faceValues.get(random.nextInt(this.faces));
    }
}
