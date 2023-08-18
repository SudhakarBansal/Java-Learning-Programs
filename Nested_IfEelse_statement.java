package practice_programs;

public class Nested_IfEelse_statement {
    public static void main(String[] args) {
    int a=231, b =341, c=211;
    if(a>b){
        if(a>c){
            System.out.println("a is greater");
        } else{
            System.out.println("c is greater");
        }
    } else{
        if(b>c){
            System.out.println("b is greater");
        } else{
            System.out.println("c is greater");
        }
    }
    }
}
