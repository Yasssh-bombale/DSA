class BitLevel_ODD_EVEN{
  public static void printOddEven(int number){
    //using & operator ;
    if((number & 1)==0){
      System.out.println("EVEN number");
    }else{
      System.out.println("ODD Number");
    }
  }
  public static void main(String[] args) {
    printOddEven(20);
  }
}