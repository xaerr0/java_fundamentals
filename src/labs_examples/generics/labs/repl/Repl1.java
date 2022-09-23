package labs_examples.generics.labs.repl;

public class Repl1 {


    public static void main(String[] args) {

        // Step 1) Create an object of the Generic class below and call the print() method on it
        MyGeneric<Integer, String> obj1 = new MyGeneric(55, "poop");

        obj1.print();

        // Step 2) Create another object of the Generic class below using a different data type and call the print() method on it
        MyGeneric<String, Integer> obj2 = new MyGeneric("poop", 55);
        obj2.print();
        // Step 3) modify the class below to require two generic types - then modify your objects above so it still works
    }
}
    class MyGeneric <T, U> {

        T val1;
        U val2;

        public MyGeneric(T val1, U val2){
            this.val1 = val1;
            this.val2 = val2;
        }
//TODO How to print both on one line? 'Operator '+' cannot be applied to 'T', 'U''
        public void print(){
            System.out.println(val1);
            System.out.println(val2);
        }
    }

