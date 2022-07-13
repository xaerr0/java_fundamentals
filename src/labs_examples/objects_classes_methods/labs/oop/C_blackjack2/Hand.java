package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void takeFromDeck(Deck deck) {
        hand.add(deck.takeCard());

    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : hand) {
            output += card + " - ";
        }
        return output;
    }

    public int handValue(){
        int value = 0;
        int aceCount = 0;
        return handValue();
    }

}
