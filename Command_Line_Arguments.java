package practice_programs;
public class Command_Line_Arguments {
    public static void main(String[] args) {
        int i=0;
        System.out.println("This program is made by Sudhakar Bansal\nRoll no : 2231");
        System.out.println("Arguments passed from Cmd are : ");
        while (i< args.length){
            System.out.println(args[i]);
            i++;
        }
    }
}
