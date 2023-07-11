package com.dsa.programs.cards;

import java.util.*;

public class MainMethod {

    public static void main(String[] args) {

        DeckOfCard dc = new DeckOfCard();
        System.out.println("before sorting -> "+dc.cards.toString());
        System.out.println(sortCards(dc.cards).toString());

        Card first = dc.cards.get(2);
        Card second = dc.cards.get(10);
        System.out.println(" first is "+first);
        System.out.println(" second is "+second);
        System.out.println(" bigger is "+biggest(first,second).toString());


    }

    private static Card biggest(Card first, Card second) {

        if(first.compareTo(second)>0){
            return first;

        }else
            return second;


    }



    private static ArrayList<Card> sortCards(ArrayList<Card> cards) {

        cards.sort((o1, o2) -> {
            if (o1.compareTo(o2) < 0)
                return -1;
            else if (o1.compareTo(o2) > 0)
                return 1;
            else
                return 0;
        });

        return cards;


    }


}
