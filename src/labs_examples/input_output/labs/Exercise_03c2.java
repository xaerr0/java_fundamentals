package labs_examples.input_output.labs;

import java.io.*;

/**
 *
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *
 *
*/
public class Exercise_03c2 {
    public static void main(String[] args) {

        String[] bbqFoods = {"Brisket", "Pulled Pork", "Cornbread"};
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("src/labs_examples/input_output/files/Exercise_03b.txt"));
            writer.write("Blah Blah Blah\n" +
                         "Look at me writing in a file\n" +
                         "Blah Blah Blah");
//            writer.write();
//            writer.write();


            for (String bbqFood : bbqFoods) {
                writer.write("\n" + bbqFood);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/labs_examples/input_output/files/Exercise_03b.txt"));
            String line;

//            Read single line
//            System.out.println(reader.readLine());

//            Print to console line by line
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
