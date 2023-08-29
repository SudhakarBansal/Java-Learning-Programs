package practice_programs;

abstract class Parent{
    abstract void greet();
}

class Child extends Parent{
    @Override
    void greet() {
        System.out.println("Good Morning");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}
