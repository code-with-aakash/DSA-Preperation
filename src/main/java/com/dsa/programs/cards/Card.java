package com.dsa.programs.cards;

public class Card implements Comparable<Card>{

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Card a) {

        Card c = (Card)a;
        int rankCompare = rank.compareTo(c.rank);
        return rankCompare != 0 ? rankCompare : suit.compareTo(c.suit);

    }
}
