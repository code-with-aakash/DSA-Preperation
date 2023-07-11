package com.dsa.programs.cards;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCard {

    protected final ArrayList<Card> cards;


    public DeckOfCard() {

        Suit[] suit = Suit.values();
        Rank[] rank = Rank.values();

        cards = new ArrayList<>();

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                this.cards.add(new Card(suit[i],rank[j]));
            }
        }

        Collections.shuffle(this.cards);
    }


    @Override
    public String toString() {
        return "DeckOfCard{" +
                "cards=" + cards +
                '}';
    }
}


