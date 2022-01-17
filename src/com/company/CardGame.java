package com.company;
import java.util.*;

public class CardGame {
    ArrayList<Card> deckOfCards = new ArrayList<>();
    ArrayList<Card> inPlay = new ArrayList<>();
    // use Name<>() calls method

    char[] suits = {'♡','♣','♢','♠'};
    String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public ArrayList<Card> getDeck() { // instantiate each card in deck
        int k = suits.length;
        int n = symbols.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                Card card = new Card(suits[i], symbols[j], values[j]);
                deckOfCards.add(card);
        }   }
        return deckOfCards;
    }

    public void shuffleDeck() { // takes deck of cards, no arg required
        Collections.shuffle(deckOfCards);
        printDeck();
    }

    public void printDeck() { // for each card in deck, print card
        for (Card card : deckOfCards) {
            card.print();
    }   }

    public void dealCard() { // deal top card of deck, send to inPlay
        int last = deckOfCards.size() - 1;
        Card deal = deckOfCards.remove(last);
        deal.print();
        inPlay.add(deal);
        // not Card.print(deal); deal is an object that can be part of an arraylist.
    }

    public void sortValue() {
        for (int b = 2; b < 15; b++) {
            for (int a = 0; a < deckOfCards.size(); a++) {
                int current = deckOfCards.get(a).value;
                if (current != b) {
                    Card swap = deckOfCards.get(a);
                    deckOfCards.remove(a);
                    deckOfCards.add(swap);
                }
            }
        }
    }

    public void sortBySuit() {
        //
    }
}