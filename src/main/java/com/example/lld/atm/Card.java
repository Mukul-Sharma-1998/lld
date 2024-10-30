package com.example.lld.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    private String cardName;
    private String cardNumber;
    private String cardOwner;
    private String cardCvv;
    private Integer currentBalance;

    public String toString() {
        return this.cardName +" "+ this.cardNumber +" "+ this.cardOwner +" "+ this.currentBalance;
    }
}
