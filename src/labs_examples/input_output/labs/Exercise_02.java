package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02{
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        int i;

        try{
            inputStream = new BufferedReader(
                    new FileReader("src/labs_examples/input_output/files/ChocChipCookRecipe.txt"));
            outputStream = new PrintWriter(
                    new FileWriter("src/labs_examples/input_output/files/ChocChipCookRecipeSECRET.txt"));

            do {
                i = inputStream.read();
                if (i != -1)
                    if ((char) i == 'a')
                        i = '-';
                outputStream.write(i);
            } while (i != -1);

            } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}