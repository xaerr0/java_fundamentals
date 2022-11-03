package labs_examples.objects_classes_methods.labs.oop.C_blackjack2;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack2.controllers.GameController;

public class MainGame {

    public static void main(String[] args) {

        //Intro
        System.out.println("Welcome to Blackjack!");
        GameController blackjack = new GameController();
        blackjack.playBlackjack();
    }
}
