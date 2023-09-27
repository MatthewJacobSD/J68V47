import java.util.*;
public class SDLesson5 {
    public static void main (String [] args) {
        //Exercise 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number:   ");
        int num = input.nextInt();
        for (int count=1; count <=12; count++){
            System.out.format("%d x %d = %d %n",num,count,(num*count));
        }

        //Exercise 2
        System.out.println("Counting from");
        for (int count=10; count >0; count--)
        {
            System.out.println(count);
        }
        System.out.println("Blast off");

        //Exercise 3
        int score = 0;
        for (int count =3; count <= 4; count++){
            System.out.print("What is 2x 3: ");
            int ans = input.nextInt();
            if (ans == 6){
                System.out.println("Correct");
            } else{
                System.out.println("Incorrect");
            }

        }

    }
}