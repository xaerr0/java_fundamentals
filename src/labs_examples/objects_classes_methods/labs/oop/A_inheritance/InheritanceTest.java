package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import mysql.labs.Exercise_04;

public class InheritanceTest {

//    Exercise_04

//    public static void main(String[] args)
//    {
//        Parent c = new Child();
//        c.doSomething();
//    }
//}
//
//class Parent
//{
//    public void doSomething()
//    {
//        System.err.println("Parent called");
//    }
//}
//
//class Child extends Parent
//{
//    public void doSomething()
//    {
//        System.err.println("Child called");
//    }


//    Exercise_05
    public static void main(String[] args)
    {
        Parent c = new Child();

    }
}

class Parent
{
    public Parent() {
        System.err.println("Parent called");

    }
}

class Child extends Parent {
    public Child() {
        System.err.println("Child called");
    }

}


