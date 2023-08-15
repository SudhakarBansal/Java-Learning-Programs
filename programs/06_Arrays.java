package programs;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = {12,34,45,2,3,12,45};
//        Traversing through array using for loop;
        System.out.println("Traversing through array using for loop");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        Reverse Traversing through array using for loop;
        System.out.println("\nReverse Traversing through array using for loop");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

//        Traversing through array using for each loop;
        System.out.println("\nTraversing through array using for each loop");
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
