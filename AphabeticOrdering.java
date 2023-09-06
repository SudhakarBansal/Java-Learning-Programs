import java.util.*;
class AphabeticOrdering{
  static String name[] = {"Moga","Ahmedabad","Agra","Bhopal", "Thane","Mumbai"};
  public static void main(String args[]){
    int l = name.length;
    String temp = null;
    System.out.print("Original Array is: "); 
    System.out.println(Arrays.toString(name));
    //Ordering Begins...
    for (int i=0;i<l;i++){
      for(int j=i+1; j<l;j++){
        if(name[j].compareTo(name[i])<0) {
          temp = name[i];
          name[i] = name[j];
          name[j] = temp;
        }
      }
    }
    System.out.print("Sorted Array is: ");
    System.out.println(Arrays.toString(name));
  }
}
