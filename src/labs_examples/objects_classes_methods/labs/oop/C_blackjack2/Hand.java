package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {

    private ArrayList<Card> hand;
    private int handValue;
    private Player dealer;

    public Player getDealer() {
        return dealer;
    }

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public int getHandValue() {
        pause();
        return handValue;

    }

    public ArrayList<Card> getHand() {
        return hand;
    }

//    public void takeFromDeck(Deck deck) {
//        hand.add(deck.takeCard());
//        calculateHandValue();
//    }




    public Card getCard(int cardNum){
        Card c = hand.get(cardNum - 1);
        return c;

    }





    public void calculateHandValue(){
        handValue = 0;
        int aceCount = 0;
        //TODO Figure out how to handle Aces
        for(Card card : hand){
            handValue += card.getValue();
            if (card.getValue() == 11){
                aceCount++;

            }
        }

        if (handValue > 21 && aceCount > 0) {
            while(aceCount > 0 && handValue > 21){
                aceCount--;
                handValue -= 10;
            }

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

    public void dealerWins(){
        if(dealer.getHand().handValue > handValue){
            System.out.println("Dealer wins!");
        }
    }

    public void freshHand(){
        hand.clear();
    }

    public void pause(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : hand) {
            output += card + " | ";
        }
//        output = output.substring(0,output.length() - 2);
        return output;
    }



}
