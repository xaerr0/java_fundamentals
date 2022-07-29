package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

public class GameController {

    public static void main(String[] args) {
        //Intro
        System.out.println("Welcome to Blackjack!");
        Player player = new Player();
        Player computerAI = new Player();
        Deck fullDeck = new Deck();
        Hand hand = new Hand();
        Card dealtCard;


//        player.newUser();



        fullDeck.shuffle();
        //method to take bets
//        player.handleBets(player);

        hand.getCard(1);
        hand.takeFromDeck(player, fullDeck);
        System.out.println("Your first card is" + hand.getDealtCard(2));
        hand.takeFromDeck(player, fullDeck);
        System.out.println("Your second card is" + hand.getCard(1));

        //TODO Have 1 card dealt at a time, (First show Card 1, then ONLY Card 2)
//        dealtCard = hand.takeFromDeck(player, fullDeck);
//        System.out.println("Your first card is" + dealtCard(1));
//
//
//
//        System.out.println("Your total is " + hand.getHandValue());
//        hand.takeFromDeck(computerAI, fullDeck);
//        hand.takeFromDeck(player, fullDeck);
//        hand.takeFromDeck(computerAI, fullDeck);
//
//        System.out.println(hand.getHandValue());




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

