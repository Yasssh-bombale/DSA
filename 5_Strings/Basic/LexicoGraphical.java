public class LexicoGraphical {
  public static void main(String[] args) {
    // apple,mango,banana;  output:mango; a < b like wise;

    String fruits[] = {"apple","mango","banana"};
    String largest = fruits[0];

    for(int i=0;i<fruits.length;i++){
      if(largest.compareToIgnoreCase(fruits[i])<0){
        largest=fruits[i];
      }
    }

    System.out.println(largest);

  }
}