package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {
        //Intro
        System.out.println("Welcome to Blackjack!");
        Player player = new Player();
        Player dealer = new Player();
        Deck fullDeck = new Deck();



        player.newUser();




//        //method to take bets
        player.handleBets();
//
//
        //Deal Player Cards
        fullDeck.dealCard(player.getHand());
        fullDeck.dealCard(player.getHand());
        System.out.println("\nYour first card is " + player.getHand().getCard(1));
        System.out.println("Your second card is " + player.getHand().getCard(2));

        //Deal Dealer's Cards
        fullDeck.dealCard(dealer.getHand());
        fullDeck.dealCard(dealer.getHand());
        System.out.println("\nMy first card is \" HIDDEN \"");
        System.out.println("My second card is " + dealer.getHand().getCard(2));

        //Total Player Hand
        System.out.println("\nYour total is " + player.getHand().getHandValue());
        player.hitOrStay(fullDeck);
        dealer.dealerHits(fullDeck);

        determineWinner(player, dealer);








//
    }

    private static void determineWinner(Player player, Player dealer) {
//        if(dealer.getHand().hasBlackjack()){
//            System.out.println("Blackjack! You win!");
//        } else if (dealer.getHand().isBust()){
//            System.out.println("You win! Dealer busts!");
//
//        }
//
//
//
//
//        //Check Player's Hand for Blackjack or Bust
//        player.getHand().hasBlackjack();
//        player.getHand().isBust();
//
//        //Ask Player to Hit or Stay
//
//
//        //Check Dealer's Hand for Blackjack or Bust
//        player.getHand().isBust();
    }


}

