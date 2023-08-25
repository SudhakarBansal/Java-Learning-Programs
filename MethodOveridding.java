package practice_programs;

class Super{
    int x;
    Super(int x){
        this.x = x;
    }
    void display(){
        System.out.println("Super x in super class = "+ x);
    }
}

class Sub extends Super{
    int y;
    Sub(int x,int y){
        super(x);
        this.y= y;
    }

    @Override
    void display() {
        System.out.println("Super x : "+x);
        System.out.println("Sub y = "+y);
    }
}
public class MethodOveridding {
    public static void main(String[] args) {
        Sub obj = new Sub(100,200);
        obj.display();
    }
}
