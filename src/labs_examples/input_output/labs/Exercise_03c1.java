package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 *
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *
 *    */

public class Exercise_03c1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("src/labs_examples/input_output/files/example_03a.txt");
            fout = new FileOutputStream("src/labs_examples/input_output/files/example_03aCOPY");

            int i;
            while ((i = fin.read()) != -1)
                fout.write((byte) i);
            System.out.println("File successfully copied.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            if (fin != null)
                fin.close();
            if (fout != null)
                fout.close();
        }



    }
}
