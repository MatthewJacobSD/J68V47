import java.util.*;
public class SDLesson9 {
    //L9E1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String response = scanner.nextLine();
        for (int i = 10; i >= 0; i--) {
            String character = response.substring(0, 1);
            response = response.substring(1, response.length());
            System.out.print(character);
        }
    }
/*
    //L9E2
    public static void exception1() {
        // exception 1
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2
        int exception2 = Integer.MAX_VALUE + 1;
    }

    public static void exception3() {
        // exception 3
        int[] myArray3 = new int[5];
        int exception3 = myArray3[5];
    }

    public static void exception4() {
        // exception 4
        int[] myArray4 = null;
        int exception4 = myArray4[0];
    }

    public static void exception5() {
        // exception 5
        File exception5 = new File("exception5.txt");
        Scanner scanner = new Scanner(exception5);
    }

    public static void exception6() {
        // exception 6
        String thisString = "Hello";
        int exception6 = Integer.parseInt(thisString);
    }

    public static void exception7() {
        // exception 7
        String exception7 = null;
        System.out.println(exception7.toUpperCase());
    }

    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }

    //L9E3
    public static int askQuestion(int number1, int number2) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ", number1, number2);
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score) {
        System.out.println("CORRECT!");
        score++;
        return score;
    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.format("WRONG! The answer is %d %n", answer);
        lives--;
        System.out.format("You have %d lives left. %n", lives);
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.format("GAME OVER. Your final score is %d %n", score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }

    int score = 0;
    int lives = 3;
    int userAnswer = 0;
    int answer = 0;
    int count = 1;
    while(count <=10&&lives >0){
        userAnswer = askQuestion(count, count * count);
        answer = count + (count * count);
        if (answer == userAnswer) {
            score = correctAnswer(score);
        } else {
            lives = wrongAnswer(answer, lives);
        }
        count++;
    }
    gameOver(score, lives);
}
*/