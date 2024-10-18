package com.example.lld.snakeAndLadder.model;

import com.example.lld.snakeAndLadder.endStartergy.EndStratergy;
import com.example.lld.snakeAndLadder.startStratergy.StartStratergy;

import java.util.List;

public class GameManager {
    public Board board;
    public List<Player> players;
    public List<Die> dies;
    public StartStratergy startStratergy;
    public EndStratergy endStratergy;

    public GameManager(Board board, List<Player> players, List<Die> dies, StartStratergy startStratergy, EndStratergy endStratergy) {
        this.board = board;
        this.players = players;
        this.dies = dies;
        this.startStratergy = startStratergy;
        this.endStratergy = endStratergy;
    }

    public void startGame() {
        // TODO: define the game logic
        int ind = 0;
        Player currentPlayer;
        int total;
        int newPosition;
        while(true) {
            total = 0;
            currentPlayer = this.players.get(ind);
            System.out.println(currentPlayer.name+": It's your turn to roll the dice!");
            int position = currentPlayer.position+1;
            System.out.println("You current position is :" + position);
            for(Die die : dies){
                total = total + die.rollDie();
            }
            System.out.println("You got: " + total);
            if(currentPlayer.position == -1) {
                if(startStratergy.isallowed(total)){
                    if(this.move(currentPlayer, total)){
                        System.out.println(currentPlayer.name + " Won");
                        break;
                    }
                } else {
                    System.out.println("You are not allowed to move!");
                }
            } else {
                if(this.move(currentPlayer, total)) {
                    System.out.println(currentPlayer.name + " Won");
                    break;
                }

            }
            ind++;
            if(ind == this.players.size()){
                ind = 0;
            }

            System.out.println();

        }
    }

    public boolean move(Player currentPlayer, int total) {

        boolean isWon = this.isWon(currentPlayer.position + total);
        if(isWon) {
            return isWon;
        }

        Hurdle hurdle = board.getHurdle(currentPlayer.position + total);
        hurdle.caught();
        int newPosition = hurdle.end;
        currentPlayer.position = newPosition;
        int position = currentPlayer.position+1;
        System.out.println(currentPlayer.name + ": You have move to " + position);
        return false;
    }

    public boolean isWon(int position) {
        return this.endStratergy.isAllowed(this.board.size, position+1);
    }

    public void endGame(Player player) {
        // TODO: define the ending logic
    }
}
