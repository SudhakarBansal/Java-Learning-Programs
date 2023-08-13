//Type casting and type conversion

package practice_programs;
public class TypeConversion {
    public static void main(String[] args) {
        float result;
        int num1,num2,x;
        char y = 'a';
        num1=10;
        num2=3;
        result=(float)num1/num2;        //--->Type casting ->Type conversion
        System.out.println("This program is made by Sudhakar Bansal\nRoll no : 2231");
        System.out.println("Result is : " + result);
        x='a'+35;           //value of x is 65
        y++;
        System.out.println("x="+x);
        System.out.println("y="+y);         //--->Type conversion
    }
}
