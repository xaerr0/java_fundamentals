package labs_examples.arrays.examples;

// Prevent a division by zero using the ?.
class NoZeroDiv2 {
    public static void main(String[] args) {

        for(int i = -5; i < 6; i++)
            if(i != 0)
                System.out.println("100 / " + i +
                        " is " + 100 / i);
    }
}
