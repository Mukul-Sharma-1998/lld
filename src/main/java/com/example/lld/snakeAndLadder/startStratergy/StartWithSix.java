package com.example.lld.snakeAndLadder.startStratergy;

import com.example.lld.snakeAndLadder.startStratergy.StartStratergy;

public class StartWithSix implements StartStratergy {
    @Override
    public boolean isallowed(int value) {
        return value == 6;
    }
}
