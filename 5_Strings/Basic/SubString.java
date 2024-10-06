
class SubString {
  public static void printSubString(String str,int startIndex,int endIndex){
      String substring="";
      for(int i=startIndex;i<endIndex;i++){
          substring+=str.charAt(i);
      }
      System.out.println(substring);
  }
  public static void main(String[] args) {
      String str="yashubombale";
      printSubString(str,0,4);
  }
}