//this program is to show the structure of java  ->> Documentation section
package practice_programs;           //Package statements
import java.io.DataInputStream;     //Import Statements
class Hello{                       //Class definitions
    void hello_world(String name){
        System.out.println("Hello "+name);
    }
}
public class Structure_of_java {    //Main class
    public static void main(String[] args) {        //main function
        Hello obj = new Hello();
        String name;
        try {
            DataInputStream obj1 = new DataInputStream(System.in);
            System.out.print("Enter Your name : ");
            name = obj1.readLine();
            System.out.println("This program is made by Sudhakar Bansal\nRoll no : 2231");
            obj.hello_world(name);
        }
        catch (Exception e){
            System.out.println("This is Exception");
        }
    }
}

