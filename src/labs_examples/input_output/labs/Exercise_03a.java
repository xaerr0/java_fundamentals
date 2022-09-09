package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *
 *    */

public class Exercise_03a {
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
