//This program to show the use of default and user defined constructor
package practice_programs;

class Rectangle1 {
    int l, b;

    //default constructor
    Rectangle1() {
        l = 0;
        b = 0;
    }

    //user-defined constructor
    Rectangle1(int x, int y) {
        l = x;
        b = y;
    }

    int rectperimeter() {
        return (2 * (l + b));
    }
}

class DefaultConstructor {

    public static void main(String[] args) {
        Rectangle1 obj1 = new Rectangle1();
        Rectangle1 obj2 = new Rectangle1(15, 10);
        System.out.println("Perimeter of first rectangle: " + obj1.rectperimeter());
        System.out.println("Perimeter of second rectangle " + obj2.rectperimeter());
    }
}

