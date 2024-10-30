package com.example.lld.atm;

import com.example.lld.atm.state.IdealState;
import com.example.lld.atm.withdrawl.FiveHunderdWithdrawl;
import com.example.lld.atm.withdrawl.HundredWithdrawl;
import com.example.lld.atm.withdrawl.TwoThousandWithdrawl;
import com.example.lld.atm.withdrawl.Withdrawl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Note> despenseNotes = new ArrayList<>();
        Atm atm = new Atm(new IdealState(), despenseNotes);

        Card card = new Card("Visa", "123456789", "Mukul", "999", 50000);
        Withdrawl twoThousandWithdrawl = new TwoThousandWithdrawl(new FiveHunderdWithdrawl(new HundredWithdrawl(null)));
        try {

            atm.getState().insertCard(atm, card);
            atm.getState().enterPin(atm, card, 1234);
            atm.getState().withdrawCash(atm, card, 38900, twoThousandWithdrawl);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
