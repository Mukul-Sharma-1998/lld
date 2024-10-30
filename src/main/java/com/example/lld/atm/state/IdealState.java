package com.example.lld.atm.state;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Card;
import com.example.lld.atm.Note;
import com.example.lld.atm.withdrawl.Withdrawl;

import java.util.List;

public class IdealState implements State{


    @Override
    public void insertCard(Atm atm, Card card) throws Exception {
        System.out.println("|");
        System.out.println("this is ideal state");
        System.out.println("The card is inserted");
        atm.setState(new ValidationState());
        System.out.println("|");
    }

    @Override
    public void enterPin(Atm atm, Card card, int pin) throws Exception {
        throw new Exception("You are not authorized to perform enter pin");
    }

    @Override
    public void cancel(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform cancellation");
    }

    @Override
    public void withdrawCash(Atm atm, Card card, int amount, Withdrawl withdrawl) throws Exception {
        throw new Exception("You are not authorized to perform withdraw cash");
    }

    @Override
    public void getReciept(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform get reciept");
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
