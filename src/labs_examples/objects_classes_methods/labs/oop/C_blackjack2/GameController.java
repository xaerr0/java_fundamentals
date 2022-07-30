package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

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

        player.getHand().hasBlackjack();


        dealer.getHand().takeFromDeck(fullDeck);
        dealer.getHand().takeFromDeck(fullDeck);
        System.out.println("\nMy first card is \" HIDDEN \"");
        System.out.println("My second card is " + dealer.getHand().getCard(2));
        dealer.getHand().hasBlackjack();
        dealer.getHand().isBust();

        System.out.println("\nYour total is " + player.getHand().getHandValue());
        player.getHand().hitOrStay(fullDeck);
        player.getHand().isBust();



//        computerAI.getHand().takeFromDeck(fullDeck);
//        System.out.println("Your total is " + p.getHandValue());

//        hand.takeFromDeck(computerAI, fullDeck);
//        hand.takeFromDeck(player, fullDeck);
//        hand.takeFromDeck(computerAI, fullDeck);
//





//        fullDeck.dealFirst(player, usedDeck);
//        fullDeck.dealFirst(computerAI, usedDeck);
//        fullDeck.dealFirst(player, usedDeck);
//        fullDeck.dealFirst(computerAI, usedDeck);






//        Deck testDeck = new Deck();
//        Card Card1 = new Card(Suit.DIAMOND, Rank.EIGHT);
//        Card Card2 = new Card(Suit.HEART, Rank.ACE);
//        Card Card3 = new Card(Suit.SPADE, Rank.JACK);
//
//        testDeck.addCard(Card1);
//        testDeck.addCard(Card2);
//        testDeck.addCard(Card3);


//
//        System.out.println(testDeck);
//

//        System.out.println(fullDeck);


        //Test
//        Deck testDeck = new Deck();
//        Hand Hand = new Hand();
//
//        testDeck.shuffle();
//        Hand.takeFromDeck(testDeck);
//        Hand.takeFromDeck(testDeck);
//        Hand.takeFromDeck(testDeck);
//        System.out.println(Hand);
//        System.out.println(testDeck);
//
//
//        System.out.println(Hand.getHand());
//        System.out.println(Hand.getHandValue());
    }



}

