// Program to calculate the sum of series : 1+ 1/2 + 1/3 + 1/4 + .... + 1/n

package practice_programs;
import java.io.DataInputStream;
public class SumOfSeries {
    public static void main(String[] args) {
        int i,n;
        float sum = 0.0f;
        DataInputStream obj = new DataInputStream(System.in);
        try {
            System.out.print("Enter the value of n : ");
            n = Integer.parseInt(obj.readLine());
            for (i=1;i<=n;i++){
                sum = sum + (1.0f/i);
            }
            System.out.println("The Sum of series is : "+sum);
        }
        catch (Exception e){
            System.out.println("this is Exception....");
        }
    }
}
