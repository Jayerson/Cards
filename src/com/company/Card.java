package com.company;

public class Card {

    String[] suits = {"♠","♡","♢","♣"};
    String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    Card (String[] suits, String[] symbols, int[] values) {
        for (int i = 0; i < 4; i++) {
            String suit = suits[i];
            for (int j = 0; j < 13; j++) {
                String symbol = symbols[j];
                int value = values[j];
            }
        }
    }
}
// What in the name of exasperation does this mean :
//
// "toString method describes class"

// I gave up half way through part 3 at midnight
//
// The words don't make any sense
//
// I'm crying because my head hurts from banging it against the fucking wall
