

class BruiteForce {
    
  public static void printSubArray(int numbers[]){
          
      int currentSum= 0;
      int maxSum = Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
          int start=i;
       
          for(int j=0;j<numbers.length;j++){
              int end =j;
              currentSum =0;
              for(int k=start;k<=end;k++){
                  System.out.print(numbers[k] + " ");
                  currentSum+=numbers[k];//currentSum=currentSum+numbers[k];
                 
                  if(currentSum>maxSum){
                      maxSum = currentSum;
                  }
              }
              
              System.out.println();
          }
         ;
      }
      System.out.println("max sum of subarray pair is "+maxSum);
     
  }
  
  public static void main(String[] args) {
     int numbers[]={10,20,30,40,50};
     printSubArray(numbers);
  }
}