
public class BinaryToDecimal{

  public static void binaryToDecimal(int binNumber){
    int myNum = binNumber;
    int power=0;
    int decNum=0;

    while(binNumber>0){
      int lastDigit=binNumber%10;
      decNum = decNum + lastDigit * (int)Math.pow(2, power);//typecasting;
      power++;

      binNumber=binNumber/10;
    }
    System.out.println("Conversion of "+myNum+" To decimal is "+decNum);
  } 

  public static void decimalToBinary(int num){
    int myNum=num;
    int power=0;
    int binNum=0;
    
    while (num>0) {
      int reminder = num%2;
      binNum=binNum + reminder * (int)Math.pow(10, power);
      power++;
      num=num/2;
    }

    System.out.println("Decimal to binary conversion of "+myNum+" is "+binNum);

  }

  public static void main(String[] args) {
      binaryToDecimal(1010);
      decimalToBinary(20);
  }
}
