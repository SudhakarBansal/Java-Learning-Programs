package practice_programs;
import java.io.DataInputStream;
public class KeyboardInput {
    public static void main(String[] args) {//main function
            int a;
            float b,sum;
            String name;
            try {
                DataInputStream obj1 = new DataInputStream(System.in);
                System.out.print("Enter Your name : ");
                name = obj1.readLine();
                System.out.print("Enter an Integer value : ");
                a = Integer.parseInt(obj1.readLine());
                System.out.print("Enter an Float value : ");
                b = Float.parseFloat(obj1.readLine());
                sum = a+b;
                System.out.println("This program is made by "+name+"\nRoll no : 2231");
                System.out.println("the sum of two numbers is : "+sum);
            }
            catch (Exception e){
                System.out.println("This is Exception");
            }

    }
}
