package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private char suit;
    private Rank rank;

    @Override
    public String toString() {
        return "Card{suit=" + suit + ", rank=" + rank + '}'; }

    public Card(char suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }


}










