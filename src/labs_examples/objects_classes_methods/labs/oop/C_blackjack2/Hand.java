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
        int i = 1;
        do {
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
                    System.out.println("Your new card is " + getCard(i + 2));

                    System.out.println("Your total is " + getHandValue());
                    i++;

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
