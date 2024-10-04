package com.example.lld.ticTacToe;

import com.example.lld.ticTacToe.checkWinnerStratergy.CheckWinnerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Board board = new Board(3,3);
        Player player1 = new Player(Symbol.X, "Mukul");
        Player player2 = new Player(Symbol.O, "Akhil");

        Game game = new Game(board, new ArrayList<>(Arrays.asList(player1, player2)));

        game.startGame();
    }
}
