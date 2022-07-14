package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

//    public Deck() {
//        deck = new ArrayList<>();
//    }

    public Deck (){
        deck = new ArrayList<>();
            //Loop through all suits
            for(Suit suit : Suit.values()){
                //Loop through all ranks
                for(Rank rank : Rank.values()){
                    //add a new card containing each suit and rank = 52 cards
                    deck.add(new Card(suit, rank));
                }
            }
            shuffle();
        }


    public void addCard(Card card){
        deck.add(card);

    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card takeCard(){

        Card takeCard = new Card(deck.get(0));
        deck.remove(0);
        return takeCard;


    }

    @Override
    //For loop to iterate through each card in the Deck and add to a String
    public String toString() {

        String output = "";

        for(Card card : deck){
            output += card;
            output += "\n";
        }
    return output;

    }



}
