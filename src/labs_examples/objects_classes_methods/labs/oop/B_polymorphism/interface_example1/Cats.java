package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interface_example1;

class Cats implements Pets {

    @Override
    public boolean doesPoop() {
        System.out.println("Cats do poop");
        return true;
    }

    @Override
    public void pee() {
        System.out.println("Cats pee indoors");
    }

    @Override
    public void eats() {
        System.out.println("Cats eat cat food");

    }
}