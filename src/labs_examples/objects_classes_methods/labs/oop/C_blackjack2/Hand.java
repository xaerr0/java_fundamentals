package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;
    private int handValue;
    private Player computerAI;
    private ArrayList<Card> card;
    private Card dealtCard;

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

    public Card getDealtCard(int index) {
        return dealtCard;
    }

    public Card takeFromDeck(Player player, Deck deck) {
        hand.add(deck.takeCard());
        calculateHandValue();
        return dealtCard;
    }

    public Card getCard(int index){
        return card.get(index);
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
