package programs;
class Base1 {
    int x;
    Base1(){
        System.out.println("I am a Base class Constructor...");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base class");
        this.x = x;
    }
}
class Derive1 extends Base1{
    int y;
    Derive1(){
        System.out.println("I am a derived class Constructor...");
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Constructors_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derive1 d = new Derive1();
    }
}
