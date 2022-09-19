package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.overload_example1;

public class OverloadExample1 {

    public static void main(String[] args) {

//        Example of Overloading #1
        int i = 10;
        char c = 'c';

        System.out.println("System.out.println is");
        System.out.println("An example of Overloading");
        System.out.println(i);
        System.out.println(c);
        System.out.println("Because different arguments can be passed");

//        Example of Overloading #2
        Sum s = new Sum();
        System.out.println(s.sum (10, 20));
        System.out.println(s.sum (10, 20, 30));

    }

//        Example of Overloading #2
    public static class Sum {

    public int sum (int x, int y){
        return (x + y);
    }

    public int sum (int x, int y, int z){
        return (x + y + z);
    }









    }



}
