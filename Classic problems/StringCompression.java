public class StringCompression {

  public static String compressString(String str){

    StringBuilder sb= new StringBuilder("");

    for(int i=0;i<str.length();i++){
      Integer count=0;
      while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;
      }
      sb.append(str.charAt(i));//abbb
      if(count>0){
        sb.append(count.toString());
      }
    }

    return sb.toString();

  }


  public static void main(String[] args) {
    String str="aabbbccccd";//a2b3c4d;
    //test case 1 : abcd =>a1b1c1 it is decompress keep this as abcd;
    
    System.out.println(compressString(str));
  }
}
