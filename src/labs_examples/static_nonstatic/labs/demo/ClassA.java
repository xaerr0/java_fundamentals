package labs_examples.static_nonstatic.labs.demo;

public class ClassA {
    public static void main(String[] args) {
//        1) A static method calling another static method in the same class
    staticMethod();

//        2) A static method calling a non-static method in the same class

        ClassA obj = new ClassA();
    obj.nonStaticMethod();

        //    3) A static method calling a static method in another class
    ClassB.staticMethod();

//        4) A static method calling a non-static method in another class
    ClassB obj2 = new ClassB();
    obj2.nonStaticMethod();



    }

    public static void staticMethod(){
        System.out.println("Static Method");

    }

    public void nonStaticMethod(){
        System.out.println("Non Static Method");

//        5) A non-static method calling a non-static method in the same class
        nonStaticMethodB();

//        6) A non-static method calling a non-static method in another class
       ClassB obj3 = new ClassB();
       obj3.nonStaticMethod();

//        7) A non-static method calling a static method in the same class
        staticMethod();

//        8) A non-static method calling a static method in another class
        ClassB.staticMethod();
    }



    public void nonStaticMethodB(){
        System.out.println("Non Static Method B");
    }
}
