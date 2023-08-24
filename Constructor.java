// program to show the use of constructors
package practice_programs;
class Rectangle {
    int l, b;

    Rectangle(int x, int y) {
        l = x;
        b = y;
    }
    int rectArea() {
        return (l * b);
    }
}
    class Constructor{
        public static void main(String[] args){
            Rectangle obj = new Rectangle(15,10);
            System.out.println(obj.rectArea());
        }
    }