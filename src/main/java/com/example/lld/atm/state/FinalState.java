package com.example.lld.atm.state;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Card;
import com.example.lld.atm.Note;
import com.example.lld.atm.withdrawl.Withdrawl;

import java.util.ArrayList;
import java.util.List;

public class FinalState implements State{

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
        System.out.println("|");
        int despensibleAmoutn = 0;
        for(Note note : atm.getDispenseNote()) {
            despensibleAmoutn = despensibleAmoutn + note.getValue();
        }
        if(despensibleAmoutn != amount) {
            System.out.println("Invalid amount, please add an amount in multiples of 100");
            atm.setDispenseNote(new ArrayList<>());
            atm.setState(new IdealState());
        } else {
            System.out.println("Collect the dispenced notes");
            for(Note note : atm.getDispenseNote()) {
                System.out.println(note.getValue());
            }
        }
        System.out.println("|");
    }

    @Override
    public void despenseReciept(Atm atm, Card card) throws Exception {
        System.out.println("|");
        System.out.println(card);
        System.out.println("|");
    }

    @Override
    public void done(Atm atm, Card card) throws Exception {
        throw new Exception("You are not authorized to perform done");
    }
}
