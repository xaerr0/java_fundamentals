package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        // Original Order
        System.out.println("Original Order: ");
        int[] num = {3, 6, 9, 12, 15};
        for (int i = 0; i < num.length; i++){

            System.out.println(num[i]);

        // Reverse Order

            }
        System.out.println("\nReverse Order: ");
        for (int i = num.length - 1 ; i >= 0; i--){
            System.out.println(num[i]);

        }

        // Strings Original Order
        String[] bbq = {"Ribs", "Pulled Pork", "Sausages", "Hamburgers"};

        System.out.println("\nOriginal String Order: ");
        for (int i = 1; i < bbq.length; i++) {

            System.out.println(bbq[i]);
        }

        // Strings Reverse Order
        System.out.println("\nReverse String Order: ");
//       for (int i = bbq.length - 1; i >= 0; i--) {
//            System.out.println(bbq[i]);
//        }

        for (int i = bbq.length - 1; i >= 0; i -= 2) {
            System.out.println(bbq[i]);
        }


        // For Each Loop
        System.out.println();
        int[] people = {2, 4, 6, 8};
        for (int j : people){
            System.out.println(j);
        }






    }

}
