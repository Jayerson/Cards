package com.company;

public class Card {

    // vars
    char suit;
    String symbol;
    int value;

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

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