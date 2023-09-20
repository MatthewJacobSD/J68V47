import java.util.*;
public class SDLesson4 {
    public static void main (String [] args) {
        /*//Prediction and testing
        //if the deposit is not greater than the value given it won't send a reply message
        //What will be displayed if deposit is 150 ?
        int deposit1 = 150;
        if (deposit1 > 100) {
            System.out.println("You get a free toaster! :)");
        }
        System.out.println("Have a nice day");
        //What will be displayed if deposit is 50 ?
        int deposit2 = 50;
        if (deposit2 > 100) {
            System.out.println("No free toaster, too bad. xD");
        }
        System.out.println("Have a nice day");
        //What will be displayed if deposit is 100 ?
        int deposit3 = 100;
        if (deposit3 > 100) {
            System.out.println("You won a free toaster but at what cost. :(");
        }
        System.out.println("Have a nice day" + "\n");

        //Exercise 1
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name:");
        String name = input.nextLine();
        //Surname
        System.out.print("What is your surname:");
        String surname = input.nextLine();
        //Tot value
        System.out.print("Total value of your order:");
        float tot_value = input.nextFloat();
        //Payment amount
        System.out.print("How much do you wish to pay?:");
        float wish_pay = input.nextFloat();
        //Remainder
        float Remainder = tot_value - wish_pay;
        //Results
        System.out.println("\n" + "===RECEIPT===");
        System.out.println("Customer:   " + name.substring(0,1) + " " + surname);
        System.out.println("Order total:   £" + tot_value);
        System.out.println("Deposit paid:   " + wish_pay);
        System.out.println("Remainder:   £" + Remainder);
        //consent free toaster
        if (wish_pay > 100) {
            System.out.println("You get a free toaster! :)");
        System.out.println("Have a nice day!" + "\n");
        }

        //Exercise 2
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of Spain: ");
        String answer3_0 = input.nextLine();
        if (answer3_0.equals("Madrid")) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry, the correct answer is: Madrid");
        }
        System.out.print("\n" + "What is the capital of France: ");
        String answer3_1 = input.nextLine();
        if (answer3_1.contains("Paris")) {
            System.out.println("That's correct!");
        }else{
            System.out.println("Sorry, the correct answer is: Paris");
        }
        System.out.println("\n" + "What is the capital of the United Kingdom: ");
        String answer3_2 = input.nextLine();
        if (answer3_2.equals("London")) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry, the correct answer is: London");
        }
        System.out.print("\n" + "What is the capital of Italy: ");
        String answer3_3 = input.nextLine();
        if (answer3_3.equals("Rome")){
            System.out.println("That's correct!");
        }else{
            System.out.println("Sorry, the correct answer is: Rome");
        }*/

        //Exercise 3
        //Tot_purchase
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        float num1 = input.nextFloat();
        //Shipping cost and Tot money - option 1 & 2
        if (num1 < 50){
            System.out.println("Your shipping cost is: £10");
            float tot_money_1 = num1 + 10;
            System.out.print("Your final cost is: £" + tot_money_1);
        }else{
            if (num1 > 50){
                System.out.println("Your shipping cost is: free");
                float tot_money_2 = num1 + 0;
                System.out.print("Your final cost is: £" + tot_money_2);
            }
        }
    }
}
