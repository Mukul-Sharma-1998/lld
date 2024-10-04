package com.example.lld.ticTacToe.checkWinnerStratergy;

import com.example.lld.ticTacToe.Board;

public interface CheckWinnerStratergy {
    boolean checkIsWinner(Board board, int i, int j);
}
