package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;
    private int handValue;
    private Player computerAI;

    public Player getComputerAI() {
        return computerAI;
    }

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public int getHandValue() {
        return handValue;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void takeFromDeck(Deck deck) {
        hand.add(deck.takeCard());
        calculateHandValue();

    }

    public Card getCard(int cardNum){
        Card c = hand.get(cardNum - 1);
        return c;

    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : hand) {
            output += card + " - ";
        }
        return output;
    }

    public void calculateHandValue(){
        handValue = 0;
        int aceCount = 0;
        //TODO Figure out how to handle Aces
        for(Card card : hand){
            handValue += card.getValue();
        }

    }
    public boolean isBust(){
        if(handValue > 21){
            return true;
        }else{
            return false;
        }
    }

    public boolean hasBlackjack(){
        if (this.handValue == 21) {
            return true;
        }else{
            return false;
        }
    }




}
