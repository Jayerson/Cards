package com.company;
import java.util.*;

public class CardGame {
    ArrayList<Card> deckOfCards = new ArrayList<Card>();
    Card next;

    public void sortBySuit() {

    }

    public void getDeck() {
        for (Card c : deckOfCards) {
            System.out.println(c);
        }
    }

    ArrayList<Card> shuffleDeck
            (String[] suits, String[] symbols, int[] values)
    {
        for (int i = 0; i < 52; i++) {
            int random = (int) Math.random() * 52 + 1;

            String suit = suits[(int) random/13];
            String symbol = symbols[(int) random/4];
            int value = values[(int) random/4];

            {suit, symbol, value};
            // add this to the arraylist
        }
    } // or HOW does Collections.shuffle actually work

    public Card dealCard() {
        if (deckOfCards.iterator().hasNext()) {
            next = deckOfCards.iterator().next();
        } else { shuffleDeck(); dealCard(); }
        return next;
    }


}

// Collections.sort()