package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interface_example1;

class Dogs implements Pets{


    @Override
    public boolean doesPoop() {
        System.out.println("Dogs do poop");
        return true;
    }

    @Override
    public void pee() {
        System.out.println("Dogs pee indoors");

    }

    @Override
    public void eats() {
        System.out.println("Dogs eat dog food");

    }
}
