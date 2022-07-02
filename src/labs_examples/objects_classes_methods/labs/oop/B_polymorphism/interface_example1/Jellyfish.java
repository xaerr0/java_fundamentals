package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interface_example1;

class Jellyfish implements Pets{

    @Override
    public boolean doesPoop() {
        System.out.println("Jellyfish do not poop");
        return false;
    }

    @Override
    public void pee() {
        System.out.println("Jellyfish pee outdoors");

    }

    @Override
    public void eats() {
        System.out.println("Jellyfish eat jellyfish food");

    }
}
