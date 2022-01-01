package com.company;
import java.util.ArrayList;

public class CardGame {
    ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public void getDeck() {
        for (Card i : deckOfCards) {
            System.out.println(i);
        }
    }
}
