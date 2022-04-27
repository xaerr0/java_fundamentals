package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        // volume

        double radius = 3.14;
        int height = 5;
        float pi = 3.14f;
        double vCyl = pi * radius * radius * height;
        System.out.println(vCyl);

        // surface area

        double sArea = 2 * pi * radius * height + 2 * pi * radius * radius;
        System.out.println(sArea);



    }
}