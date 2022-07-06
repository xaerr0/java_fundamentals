package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck extends Card {
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        System.out.println(myDeck);

    }


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    private void Deck() {

        int counter = 0;

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < cardValue.length; j++){
                char theSuit = suit[i];
                int theCardValue = cardValue[j];
                cards[counter] = new Card();
                counter++;
            }
            System.out.println(suit);
            System.out.println(cardValue);


        }


    }




}
