public class Prefix {

  public static void prefixSubArraySum(int numbers[]){

    int prefix[] = new int[numbers.length];
    prefix[0]=numbers[0];

    for(int i=1;i<numbers.length;i++){
      prefix[i]=prefix[i-1]+numbers[i];//[10,30,60,100,150];
    }

    for (int i : prefix) {
      System.out.print(i+" ");
    }
    
    int MAX_SUM = Integer.MIN_VALUE;
    int currentSum =0;

    for(int i=0;i<numbers.length;i++){

      for(int j=0;j<numbers.length;j++){
          
          currentSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
          if(currentSum>MAX_SUM){
            MAX_SUM = currentSum;
          }

      }
    }

    System.out.println("max sum of subarrray is "+MAX_SUM);
  }

  public static void main(String[] args) {
    // int numbers[]={10,20,30,40,50};
    int numbers[]={1,-2,6,-1,3};
    prefixSubArraySum(numbers);
  }
}
