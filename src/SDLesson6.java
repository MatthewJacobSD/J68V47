import java.util.*;
public class SDLesson6 {
    public static void main(String[] args) {
        //Exercise 1
        int count = 10;
        do {
            System.out.println(count);
            count += 2;
        } while (count <= 24);

        //Exercise 2
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("1.Show time\n" + "2.Tell me a joke");
        System.out.print("Answer:   ");
        String word = input.nextLine();
        if (word.equals("1")) {
            System.out.println("1. 15:30\n");
        }
        if (word.equals("2")) {
            System.out.println("2.Why couldn't the bike stand up? It was too tired.\n");
        }

        //Exercise 3
        int score = 0;
        int lives = 3;
        for (int count2 = 3; count2 <= 11; count2++) {
            while (lives > 0) {
                System.out.print("What is the sum 7 and 9?");
                System.out.print("\nAnswer:   ");
                int ans1 = input.nextInt();
                if (ans1 == 16) {
                    System.out.print("Correct\n");
                    score += 10;
                } else {
                    System.out.print("Incorrect\n");
                    lives -= 1;
                }
                System.out.print("If a rectangle has a length of 5 units and a width of 3 units, what is its area?:     " + "square units");
                System.out.print("\nAnswer:   ");
                int ans2 = input.nextInt();
                if (ans2 == 15) {
                    System.out.println("Correct\n");
                    score += 10;
                } else {
                    System.out.println("Incorrect\n");
                    lives -= 1;
                }
                System.out.print("What is the product of 6 and 8?:      ");
                int ans3 = input.nextInt();
                if (ans3 == 48) {
                    System.out.println("Correct\n");
                    score += 10;
                } else {
                    System.out.println("Incorrect\n");
                    lives -= 1;
                }
                if (lives > 0) {
                    System.out.print("If Sally has 12 apples and she gives 3 to her friend, how many apples does she have left?:    ");
                    int ans4 = input.nextInt();
                    if (ans4 == 6) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("What is the value of 15 divided by 3?:    ");
                    System.out.print("\nAnswer:   ");
                    int ans5 = input.nextInt();
                    if (ans5 == 6) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("What is the sum 85 and 5?");
                    System.out.print("\nAnswer:   ");
                    int ans6 = input.nextInt();
                    if (ans6 == 90) {
                        System.out.print("Correct\n");
                        score += 10;
                    } else {
                        System.out.print("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("If a square has a length of 5 units and a width of 5 units, what is its area?:     " + "square units");
                    System.out.print("\nAnswer:   ");
                    int ans7 = input.nextInt();
                    if (ans7 == 25) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("What is the product of 7 and 8?:      ");
                    System.out.print("\nAnswer:   ");
                    int ans8 = input.nextInt();
                    if (ans8 == 56) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("If Sally has 12 cars toys and she gives 6 to her friend, how many apples does she have left?:    ");
                    System.out.print("\nAnswer:   ");
                    int ans9 = input.nextInt();
                    if (ans9 == 6) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives > 0) {
                    System.out.print("What is the value of 20 divided by 5?:    ");
                    System.out.print("\nAnswer:   ");
                    int ans10 = input.nextInt();
                    if (ans10 == 4) {
                        System.out.println("Correct\n");
                        score += 10;
                    } else {
                        System.out.println("Incorrect\n");
                        lives -= 1;
                    }
                }
                if (lives == 0) {
                System.out.print("Congratulations you gained:   " + score);
                }
            }
        }
    }
}
