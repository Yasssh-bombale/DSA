

class PrintArrayPairs {
    
  public static void printArrayPairs(int numbers[]){
      int totalPairs=0;
      for(int i=0;i<numbers.length;i++){
          int current=numbers[i];
          for(int j=i+1;j<numbers.length;j++){
              System.out.print("("+current+","+numbers[j]+") ");
              totalPairs++;
          }
          System.out.println();
      }
      System.out.println("Total number of pairs are "+totalPairs);
  }

public static void main(String[] args) {
   int numbers[]={10,20,30,40,50,60,70};
 
   printArrayPairs(numbers);
    
   
}
}