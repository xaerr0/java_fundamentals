package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interface_example1;

public class PetController {

    public static void main(String[] args) {
        Cats cats = new Cats();
        Dogs dogs = new Dogs();
        Jellyfish jellyfish = new Jellyfish();

        cats.doesPoop();
        dogs.doesPoop();
        jellyfish.doesPoop();
        cats.pee();
        dogs.pee();
        jellyfish.pee();
        cats.eats();
        dogs.eats();
        jellyfish.eats();

    }
}

