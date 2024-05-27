public class Patterns {

  public static void hollowRectangle(int totalRows,int totalCols){
    //outerloop;
    for(int i=1;i<=totalRows;i++){
      //innner loop for row logic;
      for(int j=1;j<=totalCols;j++){
        if(i==1 || j==1|| i==totalRows||j==totalCols){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void invertedHalfPyramid(int n){
    
    for(int i =0;i<=n;i++){

        //spaces;
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }

        //star;
        for(int j =1;j<=i;j++){
          System.out.print("*");
        }

        System.out.println();
    }

  }


  //inverted half pyramid with numbers;
  public static void inverted_Reverse_Half_Pyramid(int n){
        
            
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        
        System.out.println();
    }
    
}


    public static void floydsTriangle(int n){
      int counter=1;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print(counter+" ");
              counter++;
          }
          System.out.println();
      }
    }

  public static void main(String[] args) {
    hollowRectangle(5, 15);
    invertedHalfPyramid(5);
    inverted_Reverse_Half_Pyramid(20);
    System.out.println("Floyds triangle");
    floydsTriangle(5);
  }
}
