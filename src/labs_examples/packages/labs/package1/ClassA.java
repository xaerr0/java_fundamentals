package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.ClassB;

public class ClassA {

    public static void main(){


    }

    private static void methodA2(){


    }
    //subclass invoked the protected method
    public class ClassC extends ClassB{
        public void test(){
            super.methodB();

        }

    }

}
