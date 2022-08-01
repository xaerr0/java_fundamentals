package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void hitOrStay(Deck deck) {
        do {
            int index = 3;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWould you like to 1) Hit or 2) Stay?");
            int choice = scanner.nextInt();
            //If neither 1 nor 2 is entered
            //TODO Cover if letters are input
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid Option");
            } else
                //player hits
                if (choice == 1) {
                    hand.add(deck.takeCard());
                    calculateHandValue();
                    System.out.println("Your new card is " + getCard(index));

                    System.out.println("Your total is " + getHandValue());

                }
            //player stays
            if (choice == 2) {
                calculateHandValue();
                System.out.println("Your total is " + getHandValue());

            }

        }
        while (handValue < 21);
    }


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
        }

    }
    public boolean isBust(){
        if(handValue > 21){
            System.out.println("\nYou Bust!");
            System.out.println("\nDealer Wins!");
            return true;
        }else{
            return false;
        }
    }

    public boolean hasBlackjack(){
        if (this.handValue == 21) {
            System.out.println("Blackjack! You win!");
            return true;
        }else{
            return false;
        }
    }

    public void dealerWins(){
        if(computerAI.getHand().handValue > handValue){
            System.out.println("Dealer wins!");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : hand) {
            output += card + " - ";
        }
        return output;
    }



}
