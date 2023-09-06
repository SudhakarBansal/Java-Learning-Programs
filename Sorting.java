import java.util.*; 
class SortArray{
  public static void main(String args[]){
    int[] num = {23,654,23,2,45,76};
    int l = num.length;
    System.out.print("Original Array is: "); System.out.println(Arrays.toString(num));
    //Sorting Begins...
    for (int i=0;i<l;i++){
      for(int j=i+1; j<l;j++){
      if(num[i]> num[j]){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
      }
    }
   }
  System.out.print("Sorted Array is: "); System.out.println(Arrays.toString(num));
  }
}
