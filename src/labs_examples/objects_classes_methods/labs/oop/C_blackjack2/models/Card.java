package labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models;

public class Card {

    // TODO - Jared edit - these fields can be final since they are never reassigned
    private final Suit suit;
    private final Rank rank;

    //Create card
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;

    }

    public int getValue(){
        return rank.rankValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Card(Card card){
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    public String toString(){
        return this.suit.toString() + " " + this.rank.toString() + " " + this.suit.toString();
    }

}
