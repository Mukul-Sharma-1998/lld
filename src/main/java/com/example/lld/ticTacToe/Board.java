package com.example.lld.ticTacToe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    public int rows;
    public int columns;
    public int currentTotalMoves = 0;
    public Symbol[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Symbol[this.rows][this.columns];
    }

    public Symbol getValue(int i, int j) {
        return this.board[i][j];
    }

    public void makeMove(int i, int j, Symbol symbol) {
        this.board[i][j] = symbol;
    }

    public void showBoard() {
        for(int r=0; r<this.rows; r++) {
            for(int c=0; c<this.columns; c++) {
                if(this.board[r][c] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(this.board[r][c]);
                }
            }
            System.out.println();
        }
    }
}
