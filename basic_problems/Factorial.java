

public class Factorial {

  public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }

  public static int binomialCoefficient(int n,int r){
  // formula is n!/r!*(n-r)!

    int n_factorial = factorial(n);
    int r_factorial = factorial(r);
    int n_r_factorial = factorial(n-r);

    return n_factorial/(r_factorial*n_r_factorial);
  }

  public static void main(String[] args) {
    
        int fact = factorial(5);
        System.out.println(fact);


        //finding binomial coefficient;
      int ans = binomialCoefficient(5, 2);
      System.out.println(ans);



  }
}
