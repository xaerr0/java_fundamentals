package labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models;

import java.util.Scanner;

public class Player {

    private final Hand hand = new Hand();
    private String name;
    private int potValue;
    private int bet;

    public int getBet() {
        return bet;
    }

    public Hand getHand() {
        hand.pause();
        return hand;
    }

    //TODO - Jared edit - you have a name field, use it a bit more
    public String getName() {
        return name;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public void newUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        name = scanner.next();
        //TODO - Jared edit - this only necessary when a passed variable has same name as an instance variable
        System.out.println("Hello " + name + "! How much money would you like to start with?");
        if (scanner.hasNextInt()) {
            potValue = scanner.nextInt();
        }
    }

    public void handleBets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow much would you like to bet?");
        System.out.println("You currently have $" + potValue);

        int proposedBet = scanner.nextInt();
        //TODO - Jared edit - it is best for ambiguity to use separate names for members of methods vs members of class
        // unless necessary, this also removes the need to use this

        if (proposedBet <= potValue) {
            if (proposedBet == potValue) {
                System.out.println("Are you sure you want to go all in? (y/n) ");
                String userInput = scanner.next();

                if (userInput.equalsIgnoreCase("y")) {
                    System.out.println("Nice! Good luck!");
                } else {
                    proposedBet = getAdjustedBet();
                }
            }
        } else {
            proposedBet = getAdjustedBet();
        }
        bet = proposedBet;
    }

    public int getAdjustedBet() {
        int newBet = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPlease bet less than $" + potValue);
            System.out.println("\nHow much would you like to bet?");
            newBet = scanner.nextInt();
        } while (newBet > potValue);
        return newBet;
    }

    public void hitOrStay(Deck deck) {
        hand.pause();
        int i = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWould you like to 1) Hit or 2) Stay?");
            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }
            //If neither 1 nor 2 is entered
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid Option");
            } else
                //player hits
                if (choice == 1) {
                    deck.dealCard(hand);
                    hand.calculateHandValue();
                    System.out.println("Your new card is " + hand.getCard(i + 2));

                    System.out.println("Your total is " + hand.getHandValue());
                    i++;
                }
            //player stays
            if (choice == 2) {
                hand.calculateHandValue();
                System.out.println("Your total is " + hand.getHandValue());
                break;
            }
        }
        while (hand.getHandValue() < 21);
    }

    public void dealerHits(Deck deck) {
        int i = 1;
        if (hand.getHandValue() <= 16) {
            do {
                deck.dealCard(hand);
                System.out.println("\nMy new card is " + hand.getCard(i + 2));
                i++;
            } while (hand.getHandValue() <= 16);
        }
    }

    public void printBalance() {
        System.out.println("\nYour currently have $" + getPotValue() + " left");
    }

    @Override
    public String toString() {
        return "Player{" +
                "potValue=" + potValue +
                '}';
    }
}


