package com.company;

public class Main {

    public static void main(String[] args) {
        CardGame newGame = new CardGame();
        newGame.getDeck();
        newGame.sortValue();
        newGame.printDeck();
    }
}

// always call object first: method only exists on object
