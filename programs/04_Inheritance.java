package programs;
class Base {
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base class");
        this.x = x;
    }
}

class Derive extends Base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Using X from base class object : ");
        Base a = new Base();
        a.setX(4);
        System.out.println("X = " + a.getX());

        System.out.println("\nUsing X from Derived class object : ");
        Derive b = new Derive();
        b.setX(44);
        System.out.println("X = " + b.getX());
    }
}
