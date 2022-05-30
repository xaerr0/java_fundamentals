package labs_examples.objects_classes_methods.labs.methods;

// 1) Demonstrate method overloading in this class
public class MethodTraining {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;

    }

    public static int multiply(float a, float b, float c) {
        return ((int) (a * b * c));

    }

    public static void main(String[] args) {
        int x = multiply(4, 4);
        int z = multiply((int) 3.2, (int) 2.3, (int) 1.1);

        System.out.println(x);
        System.out.println(z);


        // 2) Demonstrate the difference between "pass by value" and "pass by reference"

        //  Pass By Value
            int c = 5;
            int d = 4;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        passByValue(c, d);
        }

        public static void passByValue(int c, int d){
            c = c * 4;
            System.out.println("new c = " + c);
            d = d * 4;
            System.out.println("new d = " + d);
        }
        //   Pass By Reference
        public static void passByRef(int d[]) {





        }



    }


