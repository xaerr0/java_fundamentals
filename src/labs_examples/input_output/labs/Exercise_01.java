package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 * <p>
 * Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 * Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) {

        String filePath = "src\\labs_examples\\input_output\\files\\byte_data";

        FileInputStream fin = null;
        FileOutputStream fout = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fin = new FileInputStream(filePath);
            fout = new FileOutputStream("src\\labs_examples\\input_output\\files\\example_01.txt");
            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                fout.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing Input File");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing Output File");
            }
        }

    }
}