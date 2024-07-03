
class BinarySearch {
    
  public static int binarySearchAlgorithm(int numbers[],int key){
      int start = 0, end = numbers.length-1;//8;
      
     
      
      while(start<=end){
           int mid = (start+end)/2;//index 4 means 50 is mid;
          if(numbers[mid]==key){
              return mid;
          }else if(numbers[mid]<key){
              start=mid+1;
          }else{
              end=mid-1;
          }
      }
      //if key is not present in the array; return -1;
      return -1;
  }
  
  public static void main(String[] args) {
     int numbers[]={10,20,30,40,50,60,70,80,90};
     int key = 70;
      
     System.out.println("index for the key is "+binarySearchAlgorithm(numbers, key));
    
      
     
  }
}