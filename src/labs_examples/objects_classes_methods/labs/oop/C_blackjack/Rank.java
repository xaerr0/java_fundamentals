package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public enum Rank {

    ACE("Ace", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10);

    Rank(String cardName, int cardValue) {
        this.cardValue = cardValue;
        this.cardName = cardName;
    }

    final String cardName;
    final int cardValue;
}









