package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

public class Player {
    private Hand hand;
    private String name;
    private int potValue;



    public boolean computerAI() {
        if (hand.getHandValue() < 16)

            return true;

        return false;
    }
}


