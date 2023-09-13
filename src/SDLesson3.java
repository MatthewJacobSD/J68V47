import java.util.*;
public class SDLesson3 {
    public static void main(String [] args) {
        /*//Exercise 1
        //Name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = input.nextLine();
        //Surname
        System.out.println("What is your surname:");
        String surname = input.nextLine();
        //DoB - year
        System.out.println("Year of birth:");
        int yyyy = input.nextInt();
        //Username
        System.out.println("Your Username is:");
        System.out.println(name.substring(0,1) + surname.toLowerCase());
        //Password
        System.out.println("Your Password is: ");
        System.out.println(surname.toLowerCase().substring(0,1) + name.toUpperCase().substring(0,3) + (yyyy));

        //Exercise 2
        String answer1 = "Madrid";
        System.out.println(answer1.contains("Madrid"));
        String answer2 = "Paris";
        System.out.println(answer2.contains("London"));
        String answer3 = "Rome";
        System.out.println(answer3.contains("Rome"));*/

        //Exercise 3
        //Cost of a loan
        Scanner input = new Scanner(System.in);
        System.out.println("Cost of loan?");
        float L = input.nextFloat();
        //Interest rate
        System.out.println("Interest rate (APR%) 5");
        float interest = input.nextFloat();
        double j = ((interest/100)/12);
        //Num of years for the loan
        System.out.println("number of years for the loan?");
        float n = input.nextFloat() *12;
        //tot aka monthly payment
        double M = L * (j / (1 - Math.pow((1+j), -n) ));
        System.out.println("The monthly payment is: " + M);



    }
}
