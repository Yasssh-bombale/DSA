package while_loop;

public class problem2 {
  public static void main(String[] args) {

    // problem statement: revserse the given number;

    int n = 10899;
    int number = n;
    int revserse = 0;

    while (n > 0) {
      int lastDigit = n % 10;// finding last digit; if 10899 then last digit will be 9;
      n = n / 10;// removing last digit 10899=1089;

      // storing digits in reverse variable;
      revserse = (revserse*10)+lastDigit;
    }
    System.out.println("Reverse of "+number+" is "+revserse);

  }

}
