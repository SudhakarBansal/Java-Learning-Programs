package practice_programs;

//this program is to show the use of 2 classes
class Sum{
    int a, b;
    int calc_sum(int x,int y){
        a=x;
        b=y;
        return (x+y);
    }
}
public class Two_classes {
    public static void main(String[] args) {
        int s;
        Sum obj = new Sum();
        System.out.println("This program is made by Sudhakar Bansal\nRoll no : 2231");
        s = obj.calc_sum(10,5);
        System.out.println("Sum of the Numbers is : "+s);
    }
}
