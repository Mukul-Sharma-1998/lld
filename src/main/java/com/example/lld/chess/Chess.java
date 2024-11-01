package com.example.lld.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chess {
    private List<Player> playerList;
    private Board board;

    public void startGame() {

    }

    public void endGame() {

    }
}
