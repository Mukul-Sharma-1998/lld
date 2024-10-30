package com.example.lld.atm.withdrawl;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Note;

public class FiveHunderdWithdrawl extends Withdrawl{

    public FiveHunderdWithdrawl(Withdrawl withdrawl) {
        super(withdrawl);
    }

    @Override
    public void withdraw(Atm atm, Integer amount) {
        int notes = amount / super.FIVEHUNDRED.getValue();
        int remainingAmount = amount % super.FIVEHUNDRED.getValue();
        for(int i=0; i<notes; i++) {
            atm.getDispenseNote().add(Note.FIVE_HUNDRED);
        }
        super.nextWithdrawl(atm, remainingAmount);
    }
}
