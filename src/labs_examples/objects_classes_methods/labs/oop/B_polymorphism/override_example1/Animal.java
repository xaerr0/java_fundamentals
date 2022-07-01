package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.override_example1;

class Animal {
//    Overridden method
    public void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal{
//    Overriding method
    public void run(){
        System.out.println("Dog is running");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.run();

    }
}

