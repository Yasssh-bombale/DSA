
public class Patterns_1 {
  public static void main(String[] args) {
      for(int line=1;line<=10;line++){//outer loop for the number of lines;

        for(int star=1;star<=line;star++){//inner loop for the logic;
            System.out.print("*");
        }
        System.out.println();
      }

      // printing numbers;
      int n=10;
      for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      }

      //printing characters in increasing manner;

      char ch = 'A';
      for(int i =1;i<=5;i++){
        for(int j=1;j<=i;j++){
          System.out.print(ch);
          ch++;
        }
        System.out.println();
      }
      //output;
      // A
      // BC
      // DWF
      // GHIJK


      // now i want i to be;

      // A
      // AB
      // ABC
      // ABCD

      char ch1='A';
      for(int i =1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch1);
            ch1++;
        }
        System.out.println();
        ch1='A';
      }


  }
}
