package labs_examples.input_output.labs;

import java.io.*;
import java.util.Scanner;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, ead back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

//TODO HAAALP!
public class Exercise_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        int i;


        scannerInput();


        try {
            inputStream = new BufferedReader(new FileReader("src/labs_examples/input_output/files/ChocChipCookRecipe.txt"));
            outputStream = new PrintWriter(new FileWriter("src/labs_examples/input_output/files/ChocChipCookRecipeSECRET.txt"));

            do {
                i = inputStream.read();
                if (i != -1) if ((char) i == 'a') i = '-';
                if ((char) i == 'e') i = '~';
                outputStream.write(i);
            } while (i != -1);

//            do {
//                j = inputStream.read();
//                if (j != -1)
//                    if ((char) j == 'e')
//                        j = '~';
//                outputStream.write(j);
//            } while (j != -1);

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

    public static void scannerInput() throws IOException {
            File file = new File("src/labs_examples/input_output/files/ICPMiracles.txt");
            Scanner fs = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello, would you like to 1) encrypt or 2) decrypt your file?");
            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid Option");
            } else if (choice == 1) {
                //Code for encrypt
                while (fs.hasNextLine()) {
                    sb.append(fs.nextLine());
                    //Test Original
//                    System.out.println(fileScan.nextLine());
                    try {
                        FileReader fr = new FileReader(file);
                        FileWriter fw = new FileWriter(file + "_encrypted.txt");
                        String line = "";

                        for (int i = 0; i < sb.length(); i++) {
                            char ch = sb.toString().charAt(i);

                            line += ((char) (ch + 5));

                        }
                        //Test Encrypted File
//                    System.out.println(line);

                        fw.write(line);

                        fw.close();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
                }if (choice == 2) {
                    //Code for decrypt
                    Scanner fsEnc = new Scanner(file + "_encrypted.txt");
                    while (fsEnc.hasNextLine()) {
                        sb.append(fsEnc.nextLine());
                        //Test Original
                        System.out.println(fsEnc.nextLine());
                        try {
                            FileReader fr = new FileReader(file + "_encrypted.txt");
                            FileWriter fwDec = new FileWriter(file + "_decrypted.txt");
                            String line = "";

                            for (int i = 0; i < sb.length(); i++) {
                                char ch = sb.toString().charAt(i);

                                line += ((char) (ch - 5));

                            }

                            fwDec.write(line);

                            fwDec.close();

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;

                    }

                }

            }
        }







