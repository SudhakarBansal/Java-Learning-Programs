package practice_programs;

//program to use While loop class While Test{
public class WhileTest {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        char c;
        System.out.println("Enter a String: ");
        try {
            while ((c = (char) System.in.read()) != '\n') {
                string.append(c);
            }
        } catch (Exception e) {
            System.out.println("Error in input...");
        }
        System.out.println("You have Entered.....");
        System.out.println(string);
    }
}

