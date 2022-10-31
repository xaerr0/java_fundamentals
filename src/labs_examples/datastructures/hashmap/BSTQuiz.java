package labs_examples.datastructures.hashmap;

public class BSTQuiz {

    class Node {
        // declare a int variable "data" to hold the data
        int data;

        // declare a "left" Node
        Node left;

        // declare a "right" Node

        Node right;

        // create a Node constructor that takes in an
        // "int data" as a paremeter

        Node(int data) {
            // set the local instance variable "data" to the data param
            this.data = data;

            // set the "right" node to null

            right = null;
            // set the "left" node to null
            left = null;
        }
    }
}