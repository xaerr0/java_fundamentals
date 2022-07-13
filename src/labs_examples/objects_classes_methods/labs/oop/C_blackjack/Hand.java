package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();
    int handValue;

    public ArrayList<Card> getCards() {
        return cards;
    }


    public int getHandValue() {
        return handValue;
    }

    public Hand() {
        cards = new ArrayList<>();

    }


    public int handValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {

        }
    return handValue;

    }


}


