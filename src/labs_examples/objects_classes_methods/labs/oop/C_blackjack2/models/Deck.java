package labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private final ArrayList<Card> deck;
    //TODO - Jared edit - since you are removing cards from the deck as they are dealt, you don't need usedCards()

    public Deck() {
        deck = new ArrayList<>();
        //Loop through all suits
        for (Suit suit : Suit.values()) {
            //Loop through all ranks
            for (Rank rank : Rank.values()) {
                //add a new card containing each suit and rank = 52 cards
                deck.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void dealCard(Hand hand) {
        hand.getHand().add(takeCard());
        hand.calculateHandValue();
        hand.pause();
    }

    public Card takeCard() {
        Card takeCard = new Card(deck.get(0));
        deck.remove(0);
        return takeCard;
    }

    @Override
    //For loop to iterate through each card in the Deck and add to a String
    public String toString() {

        String output = "";

        for (Card card : deck) {
            output += card;
            output += "\n";
        }
        return output;

    }
}
