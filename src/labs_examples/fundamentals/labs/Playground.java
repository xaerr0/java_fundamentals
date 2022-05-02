package labs_examples.fundamentals.labs;

public class Playground {
    public static void main(String[] args) {

        String str = "hello!";

        String str2 = "hello!";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equals = str.equals(str2);
        System.out.println("is str equal to str2? " + equals);

        int a = 31;
        int b = 57;
        boolean bool = a == b;


        if (equals) {
            System.out.println("Test");
        } else {
            System.out.println("Cats");
        }



    }


}
