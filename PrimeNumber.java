package practice_programs;

import java.io.DataInputStream;
import java.io.IOException;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        int a, b;
        DataInputStream obj = new DataInputStream(System.in);
        try {
            System.out.println("Enter Two Integers : ");
            a = Integer.parseInt(obj.readLine());
            b = Integer.parseInt(obj.readLine());
            for (int i = a; i <= b; i++) {
                int flag = 0;
                for (int j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println("This is Exception");
        }
    }
}
