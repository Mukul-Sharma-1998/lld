package com.example.lld.ticTacToe;

import com.example.lld.ticTacToe.checkWinnerStratergy.CheckWinnerFactory;

import java.util.List;
import java.util.Scanner;

public class Game {
    public Board board;
    public List<Player> players;
    public CheckWinnerFactory checkWinnerFactory = new CheckWinnerFactory();

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while(true) {

            Player currentPlayer = players.get(index);
            this.board.showBoard();
            System.out.println(currentPlayer.name + " turn!");
            int i, j;

            while (true) {
                System.out.println("Please enter the row number:");
                i = scanner.nextInt();
                System.out.println("Please enter the column number:");
                j = scanner.nextInt();

                boolean validation = this.validateMove(i, j);
                if(validation) {
                    this.board.currentTotalMoves++;
                    break;
                }
                System.out.println("Invalid input! Please try again.");
            }

            this.makeMove(i, j, currentPlayer.symbol);

            boolean isWinner = this.isWinner(this.board, i, j);
            if(isWinner) {
                currentPlayer.isWinner = true;
                System.out.println(currentPlayer.toString());
                this.board.showBoard();
                break;
            }
            if(this.board.currentTotalMoves == this.board.rows * this.board.columns) {
                System.out.println("Draw Match!");
                break;
            }

            index++;
            if(index == players.size()) {
                index = 0;
            }
        }
        scanner.close();

    }

    private boolean validateMove(int i, int j) {
        if(i<0 || i>= this.board.rows || j<0 || j>= this.board.columns || this.board.getValue(i,j) != null) {
            return false;
        }
        return true;

    }

    private void makeMove(int i, int j, Symbol symbol) {
        this.board.makeMove(i, j, symbol);
    }

    private boolean isWinner(Board board, int i, int j) {

        if(checkWinnerFactory.checkWinnerByRow.checkIsWinner(board,i,j) ||
                checkWinnerFactory.getCheckWinnerByColumn().checkIsWinner(board, i, j)) {
            return true;
        }

        if(board.columns == board.rows) {
            if (i == j && checkWinnerFactory.checkWinnerByPositiveDiagonal.checkIsWinner(board, i, j)) {
                return true;
            }

            if (i+j == this.board.rows && checkWinnerFactory.checkWinnerByNegativeDiagonal.checkIsWinner(board, i, j)) {
                return true;
            }
        }
        return false;
    }

}
