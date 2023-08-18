package practice_programs;

public class if_else_statement {
    public static void main(String[] args){
        int even =0,odd=0;
        int[] numbers = {50,65,56,71,81};
        for(int i=0; i<numbers.length;i++) {
            if((numbers[i]%2)==0){
            even++;
        }
        else{
            odd++;
        }
        }
        System.out.println("Odd numbers: "+odd+"\nEven Numbers: "+even);
    }
}

