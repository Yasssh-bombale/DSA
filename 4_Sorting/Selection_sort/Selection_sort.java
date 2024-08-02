public class Selection_sort{
  // in selection sort find the smallest digit and push it at very beginning of the array;
  //time complexity O(n2);

  public static void SelectionSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int minPos = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[minPos]>arr[j]){
          minPos=j;
        }
      }
      //now swapping;
      int temp=arr[minPos];//storing min value;
      arr[minPos]=arr[i];
      arr[i]=temp;
    }
  }
  public static void main(String[] args){
    int arr[]={5,4,1,3,2};
    SelectionSort(arr);

    //printing array;
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("\nWith O(n2) time complexity");

  }
}