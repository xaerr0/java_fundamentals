package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private ArrayList<Integer> usedCards = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();


    public Deck() {
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Deck{" + "usedCards=" + usedCards + ", cards=" + cards + '}';
    }

    public void createFullDeck() {

        for (Suit suit : Suit.values()) {
            for (Rank cardValue : Rank.values()) {
                cards.add(new Card(suit.suit, cardValue));

            }
        }
    }

    public  Card deal() {

        Random r = new Random();
        int i;
        do {
            i = r.nextInt(cards.size());
        } while (usedCards.contains(i));

        Card card = cards.get(i);
        usedCards.add(i);

        return card;


    }

}


