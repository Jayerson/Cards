package com.company;

public class Card {

    // vars
    char suit;
    String symbol;
    int value;

    // constructor
    public Card (char suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    // output method
    void print() {
        System.out.printf("This card is the %s of %s, with value %d%n",
                this.symbol, this.suit, this.value);
    }
}