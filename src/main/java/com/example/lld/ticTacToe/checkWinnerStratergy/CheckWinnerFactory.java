package com.example.lld.ticTacToe.checkWinnerStratergy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CheckWinnerFactory {
    public CheckWinnerStratergy checkWinnerByRow = new CheckWinnerByRow();
    public CheckWinnerStratergy checkWinnerByColumn = new CheckWinnerByColumn();
    public CheckWinnerStratergy checkWinnerByPositiveDiagonal = new CheckWinnerByPositiveDiagonal();
    public CheckWinnerStratergy checkWinnerByNegativeDiagonal = new CheckWinnerByNegativeDiagonal();

}
