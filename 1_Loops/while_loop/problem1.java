package while_loop;

import java.util.Scanner;

public class problem1 {
  public static void main(String[] args){
      // problem 1: Sum of first n natural numbers

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number");

      int n = sc.nextInt();

      int sum =0;
      int i=1;
      while(i<=n){
        // sum=sum+i;
        sum+=i;
        i++;
      }
      System.out.print("Sum is "+sum);
  }
  
}
