package com.example.lld.atm.withdrawl;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Note;

import java.util.ArrayList;

public abstract class Withdrawl {
    public Note TWOTHOUSAND = Note.TWO_THOUSAND;
    public Note FIVEHUNDRED = Note.FIVE_HUNDRED;
    public Note HUNDRED = Note.HUNDRED;

    private Withdrawl nextWithdrawl;

    public Withdrawl(Withdrawl withdrawl) {
        this.nextWithdrawl = withdrawl;
    }

    public abstract void withdraw(Atm atm, Integer amount);

    public void nextWithdrawl(Atm atm, Integer amount) {
        if(this.nextWithdrawl != null) {
            this.nextWithdrawl.withdraw(atm, amount);
        } else {
            if(amount != 0) {
                System.out.println("Invalid amount!, Please choose a valid amount!");
                atm.setDispenseNote(new ArrayList<>());
            }
        }
    }
}
