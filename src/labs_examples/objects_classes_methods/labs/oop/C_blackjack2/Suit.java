package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

public enum Suit {

        CLUB("♣"),
        DIAMOND("♦"),
        HEART("♥"),
        SPADE("♠");

        String suitName;

        Suit(String suitName) {
                this.suitName = suitName;
        }

        public String toString(){
                return suitName;
        }
}