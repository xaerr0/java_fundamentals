package labs_examples.objects_classes_methods.labs.oop.C_blackjack2.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {

    private final ArrayList<Card> hand;
    private int handValue;

    public Hand() {
        hand = new ArrayList<>();
    }

    public int getHandValue() {
        pause();
        return handValue;

    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getCard(int cardNum) {
        Card c = hand.get(cardNum - 1);
        return c;
    }

    public void calculateHandValue() {
        handValue = 0;
        int aceCount = 0;
        //TODO Figure out how to handle Aces
        for (Card card : hand) {
            handValue += card.getValue();
            if (card.getValue() == 11) {
                aceCount++;
            }
        }
        //TODO - Jared note - cool solution!
        if (handValue > 21 && aceCount > 0) {
            //TODO - Jared edit - if handValue drops below 21, then the remaining ace(s) can stay 11
            while (handValue > 21 || aceCount > 0) {
                aceCount--;
                handValue -= 10;
            }
        }
    }

    public boolean isBust() {
        if (handValue > 21) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasBlackjack() {
        if (handValue == 21) {
            return true;
        } else {
            return false;
        }
    }

    public void freshHand() {
        hand.clear();
    }

    public void pause() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : hand) {
            output += card + " | ";
        }
//        output = output.substring(0,output.length() - 2);
        return output;
    }

}
