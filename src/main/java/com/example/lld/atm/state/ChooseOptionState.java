package com.example.lld.atm.state;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Card;
import com.example.lld.atm.Note;
import com.example.lld.atm.withdrawl.Withdrawl;

import java.util.ArrayList;
import java.util.List;

public class ChooseOptionState implements State{

    @Override
    public void insertCard(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform insert card");
    }

    @Override
    public void enterPin(Atm atm, Card card, int pin) throws Exception {
        throw new Exception("You are not authorized to perform enter pin");
    }

    @Override
    public void cancel(Atm atm, Card card) throws Exception {
        System.out.println("|");
        atm.setState(new IdealState());
        System.out.println("You have cancelled the transaction");
        System.out.println("|");
    }

    @Override
    public void withdrawCash(Atm atm, Card card, int amount, Withdrawl withdrawl) throws Exception {
        withdrawl.withdraw(atm, amount);
        State finalState = new FinalState();

        atm.setState(finalState);
        finalState.despenseCash(atm, card, amount);

    }

    @Override
    public void getReciept(Atm atm, Card card) throws Exception {
        System.out.println("|");
        State finalState = new FinalState();
        atm.setState(finalState);
        finalState.despenseReciept(atm, card);
        System.out.println("|");
    }

    @Override
    public void despenseCash(Atm atm, Card card, Integer amount) throws Exception {
        throw new Exception("You are not authorized to perform despense cash");
    }

    @Override
    public void despenseReciept(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform despense reciept");
    }

    @Override
    public void done(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform done");
    }
}
