package com.blackjack.database;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


    public CardDeck(){
        this(1);
    }
    public CardDeck(int numDecks){
        for (int i = 0; i < numDecks; i++) {
            for (String suit : SUITS) {
                for (String rank : RANKS) {
                    cards.add(new Card(suit, rank));
                }
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card draw(){
        if(cards.isEmpty()){
            return null;
        }
        return cards.remove(0);
    }
}
