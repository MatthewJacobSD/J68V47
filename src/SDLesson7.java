import java.util.*;
public class SDLesson7 {
    //Exercise 1 - Mighty menu
    public static void Menu() {
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("""
                1st option
                2nd option
                3rd option
                """);
        System.out.print("getOption:    ");
        int num = input.nextInt();
        if (num == 1) {
            option += 1;
            System.out.println("option 1 picked");
            System.out.println("The option value is:    " + option);
        }
        if (num == 2) {
            option += 2;
            System.out.println("option 2 picked");
            System.out.println("The option value is:    " + option);
        }
        if (num == 3) {
            option += 3;
            System.out.println("option 3 picked");
            System.out.println("The option value is:    " + option);
        } else {
            if (num > 3 || num <= 0) {
                System.out.println("Bye");
                System.out.println("The option value is:    " + option);
            }
        }

    }

    //Exercise 2 - Sum Function
    public static void calculateSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:    ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:   ");
        int num2 = input.nextInt();
        System.out.println("""
                Which operator would you like?
                1.Addition
                2.Subtraction
                3.Multiplication
                4.Division
                5.Power
                6.Remainder
                7.Square Root
                """);
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Addition selected");
            System.out.print(num1 + num2);
        }
        if (choice == 2) {
            System.out.println("subtraction selected");
            System.out.print(num1 - num2);
        }
        if (choice == 3) {
            System.out.println("multiplication selected");
            System.out.print(num1 * num2);
        }
        if (choice == 4) {
            System.out.println("division selected");
            System.out.print(num1 / num2);
        }
        if (choice == 5) {
            System.out.println("power selected");
            System.out.print(Math.pow(num1, num2));
        }
        if (choice == 6) {
            System.out.println("remainder selected");
            System.out.print(num1 % num2);
        }
        if (choice == 7) {
            System.out.println("square root selected");
            System.out.println(Math.sqrt(num1));
            System.out.println(Math.sqrt(num2));
        }
    }

    public static void main(String[] args) {
        Menu();
        calculateSum();
    }

}

