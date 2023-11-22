import java.util.*;
import java.io.*;

import static java.lang.System.out;

public class SDLesson11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //L11E1
        try (FileWriter out = new FileWriter("L11-output.txt")) {
            System.out.println("Type a number:   ");
            int num = input.nextInt();
            out.write(String.format("%d Times table %n", num));
            for (int i = 1; i <= 12; i++) {
                out.write(String.format("%d x %d = %d%n", num, i, (num * i)));
            }
        } catch (IOException e) {
            out.print("Error occurred");
        }
    }
}