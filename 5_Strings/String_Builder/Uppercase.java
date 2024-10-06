public class Uppercase {

  public static String toCreateUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    sb.append(Character.toUpperCase(str.charAt(0)));

    for(int i=1;i<str.length();i++){
      if(str.charAt(i)==' ' && i<str.length()-1){
          sb.append(str.charAt(i));//add empty space as it is;
          i++;
          //after space new word starts making it  uppercase
          sb.append(Character.toUpperCase(str.charAt(i)));
      }else{
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();

  }
  public static void main(String[] args) {
    //given an string make it first letter capital;
    String str = "hi i am yash";

    System.out.println(toCreateUpperCase(str));
  }
}
