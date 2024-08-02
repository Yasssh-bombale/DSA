import java.util.Arrays;
import java.util.Collections;
class Inbuilt_sort{
  public static void main(String[] args) {
    Integer arr[] = {5,4,1,3,2};
    Arrays.sort(arr);//time complexity O(n logn);
    // Arrays.sort(arr,0,3);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    //sorting in descending order;
    Arrays.sort(arr,Collections.reverseOrder());
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}