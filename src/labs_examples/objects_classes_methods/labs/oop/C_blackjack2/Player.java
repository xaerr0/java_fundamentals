package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.Scanner;

public class Player {
    private Hand hand = new Hand();
    private String name;
    private int potValue;
    private int bet;



    public void newUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        this.name = scanner.next();

        System.out.println("Hello " + this.name + "! How much money would you like to start with?");
        if (scanner.hasNextInt()) {
            this.potValue = scanner.nextInt();
        }
    }
    public int getPotValue() {
        return potValue;
    }


    public int setPotValue(int potValue) {
        this.potValue = potValue;
        return potValue;
    }


    @Override
    public String toString() {
        return "Player{" +
                "potValue=" + potValue +
                '}';
    }


    public void handleBets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow much would you like to bet?");
        System.out.println("You currently have $" + potValue);

        int bet = scanner.nextInt();

        if (bet <= potValue) {

            if (bet == potValue) {
                System.out.println("Are you sure you want to go all in? (y/n) ");
                String userInput = scanner.next();

                if (userInput.equalsIgnoreCase("y")) {
                    System.out.println("Nice! Good luck!");
                } else {
                    bet = getAdjustedBet();
                }
            }
            this.bet = bet;
        } else {
            this.bet = getAdjustedBet();
        }
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

    public int getBet() {
        return bet;
    }

    public Hand getHand() {
        hand.pause();
        return hand;
    }

    public void setBet(int bet) {
        this.bet = bet;
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

    public void printBalance(Player player) {
        System.out.println("Your currently have $" + getPotValue() + " left");
    }
}


