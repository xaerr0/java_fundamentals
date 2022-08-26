package labs_examples.objects_classes_methods.labs.oop.C_blackjack2.controllers;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models.Deck;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models.Hand;
import labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models.Player;

import java.util.Scanner;
import java.util.ArrayList;

public class GameController {

    private int wins, losses;
    private final Player player;
    private final Player dealer;
    private final Deck fullDeck;

    public GameController() {

        player = new Player();
        dealer = new Player();
        fullDeck = new Deck();
        player.newUser();

        //TODO - Jared edit - no need to shuffle deck here since it's shuffled in startRound()
    }

    public void playBlackjack() {
        do {
            startRound();
        } while (continuePlaying());
    }

    private void startRound() {
        fullDeck.shuffle();

        player.getHand().freshHand();
        dealer.getHand().freshHand();
        //TODO - Jared edit - handle bets here in single place instead of in constructor + continuePlaying()
        player.handleBets();

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

        Boolean winner = determineWinner();
        handleRoundEnd(winner);

        //TODO - Jared edit - this check is better placed inside continuePlaying()
        //TODO continuePlaying() will be called by while loop inside playBlackjack() so this method can end here
    }

    private boolean determineWinner() {

        if (player.getHand().isBust()) {
            System.out.println("You bust! Dealer wins!");
            return false;
        } else if (dealer.getHand().hasBlackjack()) {
            System.out.println("Dealer has Blackjack! You lose!");
            return false;
        } else if (dealer.getHand().isBust()) {
            System.out.println("Dealer busts! You win!");
            return true;
        } else if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
            System.out.println("Dealer has higher score. You lose!");
            return false;
        } else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
            System.out.println("You have a higher score. You Win!");
            return true;
        } else {
            System.out.println("Tie game! Dealer wins!");
            return false;
        }
    }

    private void handleRoundEnd(Boolean winner) {

        System.out.println("\nDealer's hand: " + dealer.getHand());
        System.out.println("Dealer's total: " + dealer.getHand().getHandValue());

        //TODO - Jared edit - just need this once, and it will trigger no matter what
        if (winner) {
            player.setPotValue(player.getPotValue() + player.getBet());
            wins++;
        } else {
            player.setPotValue(player.getPotValue() - player.getBet());
            losses++;
        }
        player.printBalance();

        //TODO - Jared edit - since this has to do with wins, fits better here
        //TODO then you don't need to check the count of wins or losses, one or the other will be > 0 at this point
        System.out.println("\nWins: " + wins + " Losses: " + losses);
    }

    // TODO - Jared edit - no need to pass Players here, since they are members of the class
    private boolean continuePlaying() {
        Scanner scanner = new Scanner(System.in);

        if (player.getPotValue() < 1) {
            System.out.println("Sorry you're out of cash! Thanks for playing!");
            return false;
        }

        System.out.println("\nWould you like to play again? (y/n)");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Good Luck!");
            //TODO - Jared edit - put this here where you know a new round is starting
            System.out.println("Starting next round.");
            //TODO - Jared edit - i like your idea of returning a boolean to help control flow so don't call startRound()
            return true;
        } else {
            System.out.println("Thanks for playing " + player.getName() + "! Quitter!");
            return false;
        }
    }
}

