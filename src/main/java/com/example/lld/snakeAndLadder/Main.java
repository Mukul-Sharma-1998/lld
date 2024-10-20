package com.example.lld.snakeAndLadder;

import com.example.lld.snakeAndLadder.endStartergy.EndWithMoreThanFinalNumber;
import com.example.lld.snakeAndLadder.model.*;
import com.example.lld.snakeAndLadder.startStratergy.StartWithOneSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Hurdle> hurdles = new ArrayList<>();
        hurdles.add(new Snake(10,5));
        hurdles.add(new Snake(44,15));
        hurdles.add(new Snake(28,20));
        hurdles.add(new Ladder(6, 21));
        hurdles.add(new Ladder(21, 45));
        hurdles.add(new Ladder(39, 41));

//        for(Hurdle hurdle: hurdles){
//            System.out.println(hurdle.start +" "+ hurdle.end);
//        }


        Board board = new Board(50, hurdles);

        Die die = new Die(6, Arrays.asList(1,2,3,4,5,6));
        List<Die> dies = new ArrayList<>();
        dies.add(die);

        Player player1 = new Player(-1, false, "Mukul");
        Player player2 = new Player(-1, false, "Divya");
        List<Player> players = new ArrayList<>(Arrays.asList(player2, player1));

        GameManager gameManager = new GameManager(board, players, dies, new StartWithOneSix(), new EndWithMoreThanFinalNumber());
        gameManager.startGame();



    }
}
