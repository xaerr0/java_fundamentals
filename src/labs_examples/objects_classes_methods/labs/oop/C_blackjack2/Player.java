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
        this.potValue = scanner.nextInt();
    }

    public void handleBets(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow much would you like to bet?");
        System.out.println("You currently have " + potValue);

        int bet = scanner.nextInt();

        if (bet <= potValue) {

            if (bet == potValue) {
                System.out.println("Nice! Good luck!");
//                String userInput = scanner.nextLine();
//                if (userInput.equalsIgnoreCase("yes"));
//                System.out.println("Nice! Good luck!");
            }
            player.setBet(bet);
        } else {
            do {
                System.out.println("\nPlease bet less than $" + potValue);
                System.out.println("\nHow much would you like to bet?");
                bet = scanner.nextInt();
            } while (bet > potValue);


            player.setBet(bet);
        }
    }


    public int getBet() {
        return bet;
    }

    public Hand getHand() {
        return hand;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

//    public boolean computerAI() {
//        if (hand.getHandValue() < 16)
//
//            return true;
//
//        return false;
//
//
//    }
}


