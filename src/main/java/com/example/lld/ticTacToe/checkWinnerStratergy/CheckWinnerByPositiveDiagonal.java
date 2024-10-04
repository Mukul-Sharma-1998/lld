package com.example.lld.ticTacToe.checkWinnerStratergy;

import com.example.lld.ticTacToe.Board;

public class CheckWinnerByPositiveDiagonal implements CheckWinnerStratergy{
    @Override
    public boolean checkIsWinner(Board board, int i, int j) {
        for(int r=0; r<board.rows; r++) {
            if(board.getValue(r,r) == null || board.getValue(r,r) != board.getValue(i,j)) {
                return false;
            }
        }
        return true;
    }
}
