package programs;
import java.util.Scanner;
public class methods_in_java {

    static int first_method(String s,int x,int y){
        System.out.println("We are inside the function body...");
        System.out.println("Hello, "+s);
        return (x+y);
    }

    public static void main(String[] args) {
        String s;
        int num1,num2,result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter your name : ");
        s = sc.nextLine();
        System.out.print("Enter two integers : ");
        num1= sc.nextInt();
        num2= sc.nextInt();
        result = first_method(s,num1,num2);
        System.out.println("We are outside the function body...");
        System.out.println("Sum of Numbers is : "+result);
    }
}
