package labs_examples.input_output.labs;


import javax.annotation.processing.Filer;
import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    2) Demonstrate the usage of at least two additional Character Streams
*/


public class Exercise_03a {
    public static void main(String[] args) {

        FileWriter writer = null;
        FileReader reader = null;

        try {
            writer = new FileWriter("output.txt");
            reader = new FileReader("input.txt");

            int i;
            while ((i = reader.read()) != -1) {
                writer.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


