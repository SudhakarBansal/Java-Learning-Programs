package programs;
 class Super{
     void Method1(){
         System.out.println("Method1 of Super Class is Running....");
     }
     void Method2(){
         System.out.println("Method2 of Super class is Running...");
     }
 }
 class Sub extends Super{
     void Method2(){
         System.out.println("Method2 of Sub Class is Running....");
     }
     void Method3(){
         System.out.println("Method3 of Sub class is Running...");
     }
 }
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.Method1();
        obj.Method2();
//        obj.Method3();    ---> It will give an error
    }
}
