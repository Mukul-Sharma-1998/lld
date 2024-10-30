package com.example.lld.atm;

public enum Note {
    HUNDRED(100),
    FIVE_HUNDRED(500),
    TWO_THOUSAND(2000);

    private final int value;


    Note(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
