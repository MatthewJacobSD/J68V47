import java.lang.reflect.GenericSignatureFormatError;
import java.util.*;
import java.io.*;

import static java.lang.System.out;

public class SDLesson11 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //L11E1
        try (FileWriter out = new FileWriter("L11-output.txt")) {
            System.out.print("Type a number:   ");
            int num = input.nextInt();
            out.write(String.format("%d Times table %n", num));
            for (int i = 1; i <= 12; i++) {
                out.write(String.format("%d x %d = %d%n", num, i, (num * i)));
            }
        } catch (IOException e) {
            out.print("Error occurred");
        }
        //L11E2
        try (FileReader in = new FileReader("L11-output.txt")) {
            BufferedReader br = new BufferedReader(in);
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        }
    }
}