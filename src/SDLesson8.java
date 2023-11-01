import java.util.*;
public class SDLesson8 {
    public static void main(String[] args) {
        //Exercise 1
        Scanner input = new Scanner(System.in);//For loop string, per i print i of surnames
        String[] Students_name = {"Emma", "Alexander", "Olivia", "Liam", "Sophia"};
        String[] Student_surname = {"Thompson", "Rodriguez", "Chen", "Foster", "Ahmed"};
        for (int i = 0; i < Students_name.length; i++) {
            System.out.println("Name & Lastname: " + Students_name[i] + " " + Student_surname[i]);
        }
        //Exercise 2
        ;
        int[] score = {30, 75, 38, 98, 97, 76, 78 ,47, 100};
        int sum = 0;
        for (int j : score) {
            System.out.println("Student score:  " + j);
            sum += j;
        }
        System.out.println("Sum of the scores is:    " + sum);

        //Exercise 3
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                        "Walk down the road for two blocks until you reach the traffic lights.",
                        "At the traffic lights, turn right onto Oak Street.",
                        "Follow Oak Street for one block then turn left onto Elm Street.",
                        "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                        "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                        "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
                };
        // Print out each direction
        int step = 1;
        for(String direction : directions) {
            System.out.format("%d. %s %n",step,direction);
            step ++;
        }
    }
}
