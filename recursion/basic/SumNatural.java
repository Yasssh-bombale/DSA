public class SumNatural {
  public static int Sum_Of_N_Natural_Numbers(int n){
    if(n==1){
      return 1;
    }
    int Sn1 = Sum_Of_N_Natural_Numbers(n-1);
    int Sn = n+Sn1;
    return Sn;
  }
  public static void main(String[] args) {
    System.out.println(Sum_Of_N_Natural_Numbers(5));
  }
}
