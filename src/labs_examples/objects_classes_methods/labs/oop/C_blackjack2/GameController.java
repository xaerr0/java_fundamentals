package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

public class GameController {

    public static void main(String[] args) {
        //Intro
        System.out.println("Welcome to Blackjack!");


//        Deck testDeck = new Deck();
//        Card Card1 = new Card(Suit.DIAMOND, Rank.EIGHT);
//        Card Card2 = new Card(Suit.HEART, Rank.ACE);
//        Card Card3 = new Card(Suit.SPADE, Rank.JACK);
//
//        testDeck.addCard(Card1);
//        testDeck.addCard(Card2);
//        testDeck.addCard(Card3);

        Deck fullDeck = new Deck();
//
//        System.out.println(testDeck);
//
        fullDeck.shuffle();
//        System.out.println(fullDeck);


        //Test
        Deck testDeck = new Deck();
        Hand testHand = new Hand();

        testDeck.shuffle();
        testHand.takeFromDeck(testDeck);
        testHand.takeFromDeck(testDeck);
        testHand.takeFromDeck(testDeck);
        System.out.println(testHand);
        System.out.println(testDeck);


        System.out.println(testHand.getHand());
        System.out.println(testHand.getHandValue());
    }



}

