package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Comparator;

public class BlackjackController {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player1 = new Player();

        deck.createFullDeck();
        System.out.println(deck);

        for(int i = 0; i < 52; i++){
            System.out.println(deck.deal());
        }
        deck.getUsedCards().sort(Comparator.naturalOrder());
        System.out.println(deck.getUsedCards());

        System.out.println(player1.getHand().getCards().add(deck.deal()));



        }

}

