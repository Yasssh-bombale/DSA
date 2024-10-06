class Builder_intro{
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("");

    for(char ch='a';ch<='z';ch++){
      str.append(ch);
    }
    System.out.println(str);//timeComplexity=O(n);
    /*
     
      String s1="abc";
      String s2="abc";
      String s3=new String("abc");

      here s1==s2 but s2!=s3 because s1 and s2 are store in heap memory s2 refers to the s1s memmory where s3 has its own special allocated memmory when we compare s2 and s3 its actually compairing based on memmories;


     */
  }
}