package programs;

import java.util.Scanner;

public class Fibonacci_series {
    static int fibonacci_recursion(int n)           //using recursion
    {
        if (n <= 1) return n;
        return fibonacci_recursion(n - 1) + fibonacci_recursion(n - 2);
    }


    static void fibonacci_iterative(int x)       //fibonacci using Loops(iteration)
    {
        int prev = 0;
        int curr = 1;
        int next;
        if (x == 1) {
            System.out.println(prev);
        } else if (x == 2) {
            System.out.print(prev + " " + curr);
        } else {
            System.out.print(prev + " " + curr);
            for (int i = 2; i < x; i++) {
                next = prev + curr;
                System.out.print(" " + next);
                prev = curr;
                curr = next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("fibonacci series using recursion : ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci_recursion(i) + " ");
        }


        System.out.println("\nfibonacci series using loops : ");
        fibonacci_iterative(num);
    }
}

