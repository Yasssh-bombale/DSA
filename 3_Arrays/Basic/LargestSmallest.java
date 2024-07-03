// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LargestSmallest {
    
  public static int getLargestNumber(int numbers[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
          if(numbers[i]>largest){
              largest=numbers[i];
          }
      }
      
      return largest;
      
  }
  
  public static int getSmallestNumber(int numbers[]){
      int smallest = Integer.MAX_VALUE;
      for(int i=0;i<numbers.length;i++){
          if(numbers[i]<smallest){
              smallest=numbers[i];
          }
      }
      
      return smallest;
  }
  
  public static void main(String[] args) {
     int numbers[]={50,20,10,70,40};
   
    int largestNumber = getLargestNumber(numbers);
    int smallestNumber = getSmallestNumber(numbers);
    System.out.println("Smallest number is "+smallestNumber);
    System.out.println("Largest number is "+largestNumber);
  }
}