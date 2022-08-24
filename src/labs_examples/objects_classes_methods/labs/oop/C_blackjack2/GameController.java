package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.Scanner;
import java.util.ArrayList;

public class GameController {

    private int wins, losses;
    private Player player;
    private Player dealer;
    private Deck fullDeck;
    private Hand hand;


    public GameController() {

        player = new Player();
        dealer = new Player();
        fullDeck = new Deck();
        hand = new Hand();

        player.newUser();
        player.handleBets();

        fullDeck.shuffle();

        startRound();


    }


//
//
//
//
//

//
//
////        //method to take bets
//
////
////
//        //Deal Player Cards
//        fullDeck.dealCard(player.getHand());
//        fullDeck.dealCard(player.getHand());
//        System.out.println("\nYour first card is " + player.getHand().getCard(1));
//        System.out.println("Your second card is " + player.getHand().getCard(2));
//
//        //Deal Dealer's Cards
//        fullDeck.dealCard(dealer.getHand());
//        fullDeck.dealCard(dealer.getHand());
//        System.out.println("\nMy first card is \" HIDDEN \"");
//        System.out.println("My second card is " + dealer.getHand().getCard(2));
//
//        //Total Player Hand
//        System.out.println("\nYour total is " + player.getHand().getHandValue());
//        player.hitOrStay(fullDeck);
//        if (!player.getHand().isBust()) {
//            dealer.dealerHits(fullDeck);
//
//        }
//
//
//        determineWinner(player, dealer);


//


    private void determineWinner(Player player, Player dealer) {
//        int loseMoney = player.setPotValue(player.loseMoney());

//        hand.pause();
        if (player.getHand().isBust()) {
            System.out.println("You bust! Dealer wins!");
            losses++;
            player.setPotValue(player.getPotValue() - player.getBet());
        } else if (dealer.getHand().hasBlackjack()) {
            System.out.println("Dealer has Blackjack! You lose!");
            losses++;
            player.setPotValue(player.getPotValue() - player.getBet());
        } else if (dealer.getHand().isBust()) {
            System.out.println("Dealer busts! You win!");
            wins++;
            player.setPotValue(player.getPotValue() + player.getBet());
        } else if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
            System.out.println("Dealer has higher score. You lose!");
            losses++;
            player.setPotValue(player.getPotValue() - player.getBet());
        } else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
            System.out.println("You have a higher score. You Win!");
            wins++;
            player.setPotValue(player.getPotValue() + player.getBet());
        } else if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
            System.out.println("Tie game! Dealer wins!");
            losses++;
            player.setPotValue(player.getPotValue() - player.getBet());
        }

//        hand.pause();
        System.out.println("\nDealer's hand: " + dealer.getHand());
        System.out.println("Dealer's total: " + dealer.getHand().getHandValue());


    }


    private void startRound() {
        player.getHand().freshHand();
        dealer.getHand().freshHand();
        fullDeck.shuffle();


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
        if (!player.getHand().isBust()) {
            dealer.dealerHits(fullDeck);
        }

        determineWinner(player, dealer);


        if (wins > 0 || losses > 0) {
            System.out.println();
            System.out.println("Starting next round.");
            System.out.println("\nWins: " + wins + " Losses: " + losses);
        }
        if (player.getPotValue() > 1) {
            continuePlaying(player, dealer);
        } else {
            System.out.println("Sorry you're out of cash! Thanks for playing!");
        }

    }

    private boolean continuePlaying(Player player, Player dealer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWould you like to play again? (y/n)");
        String choice = scanner.next();

//        if (player.getPotValue() < 1){
//            System.out.println("Sorry you're out of cash! Thanks for playing!");
//            return false;
//        }
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Good Luck!");
            System.out.println("You now have $" + player.getPotValue());
            player.handleBets();
            startRound();
            return true;


        } else {
            System.out.println("Thanks for playing! Quitter!");
            return false;
        }

    }
}

