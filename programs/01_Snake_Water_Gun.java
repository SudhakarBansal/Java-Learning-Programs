package programs;

import java.util.Scanner;
import java.util.Random;
public class Snake_Water_Gun {
    //mapping numbers with symbols...
    static void myMethod(int a) {
        switch (a) {
            case 1 -> System.out.println("snake (🐍)");
            case 2 -> System.out.println("Water (🌊)");
            case 3 -> System.out.println("Gun (🔫)");
            default -> System.out.println("Invalid choice !");
        }
    }
    public static void main(String[] args){
        int score = 0;
        System.out.println("\nWelcome to the Snake Water Gun Game... ");
        for (int i = 0; i < 5; i++) {       // loop for playing 5 matches...

            // Generating a random number btw. 1-3
            Random rand = new Random();
            int sys_ch = rand.nextInt(1,4);

            // Menu ....
            System.out.println("\n\nPress one the following key : ");
            System.out.println("1. for Snake (🐍)");
            System.out.println("2. for Water (🌊)");
            System.out.println("3. for Gun (🔫)");
            System.out.print("Enter your choice : ");

            // Getting user's choice...
            Scanner sc = new Scanner(System.in);
            int user_ch = sc.nextInt();

            System.out.print("You : ");
            myMethod(user_ch);
            System.out.print("Computer : ");
            myMethod(sys_ch);


            // Win conditions...
            if (user_ch != sys_ch) {
                if (user_ch == 1 && sys_ch == 2) {
                    System.out.println("You win \nAs snake will swim though the water...");
                    score++;
                }
                else if (user_ch == 1 && sys_ch == 3) {
                    System.out.println("Computer win \nAs Gun will kill the snake...");
                }
                else if (user_ch == 2 && sys_ch == 3) {
                    System.out.println("You win \nAs Gun has no effect on water...");
                    score++;
                }
                else if (user_ch == 2 && sys_ch == 1) {
                    System.out.println("Computer win \nAs snake will swim though the water...");
                }
                else if (user_ch == 3 && sys_ch == 1) {
                    System.out.println("You win \nAs Gun will kill the snake...");
                    score++;
                }
                else if (user_ch == 3 && sys_ch == 2) {
                    System.out.println("Computer win \nAs Gun has no effect on water...");
                }
                else
                {
                    System.out.println("Please Enter a number between 1 to 3...");
                    i--;
                }
            }
            else {
                System.out.println("It's a Tie... ");
            }
        }
        System.out.print("\n\nYou scores are :  "+score+" out of 5.");
    }
}
