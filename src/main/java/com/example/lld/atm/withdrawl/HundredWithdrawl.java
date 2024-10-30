package com.example.lld.atm.withdrawl;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Note;

public class HundredWithdrawl extends Withdrawl{
    public HundredWithdrawl(Withdrawl withdrawl) {
        super(withdrawl);
    }
    @Override
    public void withdraw(Atm atm, Integer amount) {
        int notes = amount / super.HUNDRED.getValue();
        int remainingAmount = amount % super.HUNDRED.getValue();
        for(int i=0; i<notes; i++) {
            atm.getDispenseNote().add(Note.HUNDRED);
        }
        super.nextWithdrawl(atm, remainingAmount);
    }
}
