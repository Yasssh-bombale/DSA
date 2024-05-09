package while_loop;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
      // check whether the given number is prime or not?;

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
    boolean isPrime = true;
      if(n==2){
       System.out.println("n is Prime number");
      }else{

        for(int i =2;i<n-1;i++){
          if(n%i==0){
            isPrime=false;
          }  
        }
        if(isPrime){
          System.out.println("N is prime number");
        }else{
          System.out.println("N is not prime number");
        }
      }

  }

}
