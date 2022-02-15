package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CardGame newGame = new CardGame();
        newGame.getDeck();
        newGame.shuffleDeck();
        newGame.dealCard();
        for (int i = 1; i < 52; i++) {
            newGame.dealCard();
            if (newGame.inPlay.get(i).value == newGame.inPlay.get(i-1).value) {
                System.out.println("Snap!");
                break;
            } else if (i == 51) System.out.println("No pairs this game");
        }

    }
}

// always call object first: method only exists on object
