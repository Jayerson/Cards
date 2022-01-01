package com.company;

public class Card {
    String[] suit = {"♠","♡","♢","♣"};
    String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    Card(String[] suit, String[] symbol, int[] value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }
}
