package practice_programs;

class Class {
    final int i = 10;
    final void display() {
        System.out.println("Super class method");
        System.out.println("\nValue of final variable :" + i);
    }
}

public class FinalMethod {
    public static void main(String args[]) {
        Class obj = new Class();
        obj.display();
    }
}
