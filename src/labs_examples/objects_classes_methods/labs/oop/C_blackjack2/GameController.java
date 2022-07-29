package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

public class GameController {

    public static void main(String[] args) {
        //Intro
        System.out.println("Welcome to Blackjack!");
        Player player = new Player();
        Player computerAI = new Player();
        Deck fullDeck = new Deck();
        Deck usedDeck = new Deck();
        Hand hand = new Hand();

        player.newUser();



        fullDeck.shuffle();
        //method to take bets
//        player.handleBets(player);


        hand.takeFromDeck(fullDeck);
        hand.takeFromDeck(fullDeck);
        System.out.println(hand.getHand());
        System.out.println(hand.getHandValue());
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

