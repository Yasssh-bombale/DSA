public class kadanesAlgorithm {

  public static void findSubArrayMaxSum(int numbers[]){
    //kadens algortihm says that if the addtion of the currentSum and numbers[i] is negative then consider it as an 0 insted of considering any negative values thats it;

    int currentSum =0,maxSum=Integer.MIN_VALUE;


    for(int i=0;i<numbers.length;i++){
      currentSum+=numbers[i];
      if(currentSum<0){
        currentSum=0;
      }  
      maxSum=Math.max(currentSum, maxSum);//Math.max(var1,var2) will return the max among 2 variables;
    }
    System.out.println("max sum of subarray is "+maxSum);
  }


  public static void main(String[] args) {
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    findSubArrayMaxSum(numbers);
  }
}