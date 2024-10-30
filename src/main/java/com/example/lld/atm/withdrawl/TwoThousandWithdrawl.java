package com.example.lld.atm.withdrawl;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Note;

public class TwoThousandWithdrawl extends Withdrawl{
    public TwoThousandWithdrawl(Withdrawl withdrawl) {
        super(withdrawl);
    }
    @Override
    public void withdraw(Atm atm, Integer amount) {
        int notes = amount / super.TWOTHOUSAND.getValue();
        int remainingAmount = amount % super.TWOTHOUSAND.getValue();
        for(int i=0; i<notes; i++) {
            atm.getDispenseNote().add(Note.TWO_THOUSAND);
        }
        super.nextWithdrawl(atm, remainingAmount);
    }
}
