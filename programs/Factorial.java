package programs;
import java.util.Scanner;
public class Factorial {
    static int factorial_recursion(int x)       //Factorial using recursion
    {
        if (x==0 || x==1)
            return(1);
        else
            return(x * factorial_recursion(x-1));
    }
    static int factorial_iterative(int x)       //Factorial using Loops(iteration)
    {
        if (x==0 || x==1)
            return(1);
        else {
            int fact = 1;
            for (int i=1;i<=x;i++){
                fact = fact * i;
            }
            return (fact);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is : "+factorial_recursion(num));
        System.out.println("Factorial of "+num+" is : "+factorial_iterative(num));
    }
}
