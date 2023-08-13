package practice_programs;
import java.lang.Math;
class CalcInterest{
    int p,r,t,n;
    double i;
    double calc_simpleInterest(int a, int b, int c){
        p=a;
        r=b;
        t=c;
        i = (p*r*t)/100.0f;
        return (i);
    }
    double calc_compoundInterest(int a, int b, int c, int d){
        p=a;
        r=b;
        t=c;
        n=d;
        i = p*(Math.pow((1+ (double) r /n),(n*t)));
        return (i);
    }
}
public class Interest {
    public static void main(String[] args) {
        CalcInterest obj = new CalcInterest();
        double simple_interest;
        double compound_interest;
        simple_interest=obj.calc_simpleInterest(9878,5,2);
        compound_interest=obj.calc_compoundInterest(9878,5,2,5);
        System.out.println("Simple Interest is : "+simple_interest);
        System.out.println("Compound Interest is : "+compound_interest);
    }
}
