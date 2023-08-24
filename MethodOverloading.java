//program to show constructor and method overloading
package practice_programs;

class Rectangle2 {
    int l, b;

    //constructor 1 with no parameters
    Rectangle2() {
        l = 0;
        b = 0;
    }

    //constructor 2 with 2 parameters
    Rectangle2(int x, int y) {
        l = x;
        b = y;
    }

    int rectperimeter() {
        return (2 * (l + b));
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Rectangle2 obj = new Rectangle2();
        Rectangle2 obj1 = new Rectangle2(15, 10);
        System.out.println("Perimeter of first rectangle: " + obj.rectperimeter());
        System.out.println("Perimeter of second rectangle: " + obj1.rectperimeter());
    }
}
