package com.example.lld.atm.state;

import com.example.lld.atm.Atm;
import com.example.lld.atm.Card;
import com.example.lld.atm.Note;
import com.example.lld.atm.withdrawl.Withdrawl;

import java.util.List;

public interface State {
    public void insertCard(Atm atm, Card card) throws Exception;
    public void enterPin(Atm atm, Card card, int pin) throws Exception;
    public void cancel(Atm atm, Card card) throws Exception;
    public void withdrawCash(Atm atm, Card card, int amount, Withdrawl withdrawl) throws Exception;
    public void getReciept(Atm atm, Card card) throws Exception;
    public void despenseCash(Atm atm, Card card, Integer amount) throws Exception;
    public void despenseReciept(Atm atm, Card card) throws Exception;
    public void done(Atm atm, Card card) throws Exception;
}
