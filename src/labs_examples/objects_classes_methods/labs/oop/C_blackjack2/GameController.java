package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {
        //Intro
        System.out.println("Welcome to Blackjack!");
        Player player = new Player();
        Player dealer = new Player();
        Deck fullDeck = new Deck();


//        player.newUser();


        fullDeck.shuffle();
        //method to take bets
//        player.handleBets(player);

        player.getHand().takeFromDeck(fullDeck);
        player.getHand().takeFromDeck(fullDeck);
        System.out.println("Your first card is " + player.getHand().getCard(1));
        System.out.println("Your second card is " + player.getHand().getCard(2));


        dealer.getHand().takeFromDeck(fullDeck);
        dealer.getHand().takeFromDeck(fullDeck);
        System.out.println("\nMy first card is \" HIDDEN \"");
        System.out.println("My second card is " + dealer.getHand().getCard(2));
        dealer.getHand().hasBlackjack();
        dealer.getHand().isBust();

        System.out.println("\nYour total is " + player.getHand().getHandValue());
        player.getHand().hasBlackjack();
        player.getHand().hitOrStay(fullDeck);
        player.getHand().isBust();

    }









}

