package com.example.lld.ticTacToe.checkWinnerStratergy;

import com.example.lld.ticTacToe.Board;

public class CheckWinnerByRow implements CheckWinnerStratergy{
    @Override
    public boolean checkIsWinner(Board board, int i, int j) {
        for(int c=0; c<board.columns; c++) {
            if(board.getValue(i,c) == null || board.getValue(i,c) != board.getValue(i,j)) {
                return false;
            }
        }
        return true;
    }
}
