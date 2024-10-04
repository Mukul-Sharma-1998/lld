package com.example.lld.ticTacToe.checkWinnerStratergy;

import com.example.lld.ticTacToe.Board;

public class CheckWinnerByColumn implements CheckWinnerStratergy{
    @Override
    public boolean checkIsWinner(Board board, int i, int j) {
        for(int r=0; r<board.rows; r++) {
            if(board.getValue(r,j) == null || board.getValue(r,j) != board.getValue(i,j)) {
                return false;
            }
        }
        return true;
    }
}
