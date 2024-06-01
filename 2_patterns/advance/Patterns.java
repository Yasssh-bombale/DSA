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

    public static void zero_One_Half_Triangle(){
            
      System.out.println("Zero one half triangle pattern");
      for(int i=1;i<=5;i++){
          //innner logic;
         for(int j=1;j<=i;j++){
             if((i+j)%2==0){
                 System.out.print("1");
             }else{
                 System.out.print("0");
             }
         }
         System.out.println();
      }    
      
  }

  public static void butterfly_pattern(int n){
    System.out.println("\n Butterfly pattern pattern \n");
    for(int i=1;i<=n;i++){
        //stars;
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces;
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        
        //reverse;
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println(); 
    }
    
    // mirror image / copy of previous half;
    for(int i=n;i>=1;i--){
         //stars;
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces;
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        
        //reverse;
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println(); 
    }
    
}


public static void solid_Rhombus(int n){

  System.out.println("\n Solid Rhombus pattern \n");


  for(int i=1;i<=n;i++){
      //spaces;
      for(int j=1;j<=n-i;j++){
          System.out.print(" ");
      }
      //stars;
      for(int j=1;j<=n;j++){
          System.out.print("*"+" ");
      }
      // spaces;
      for(int j=1;j<=i;j++){
          System.out.print(" ");
      }
      
      System.out.println();
  }
}
public static void diamond_pattern(int n){
  
  System.out.println("\n Diamond pattern \n");
  for(int i=1;i<=n;i++){
      //spaces;
      for(int j=1;j<=n-i;j++){
          System.out.print(" ");
      }
      
      //stars;
      for(int j=1;j<=(2 *i)-1;j++){
          System.out.print("*");
      }
      
      System.out.println();
  }
  //mirror image;
   for(int i=n;i>=1;i--){
           //spaces;
      for(int j=1;j<=n-i;j++){
          System.out.print(" ");
      }
      
      //stars;
      for(int j=1;j<=(2 *i)-1;j++){
          System.out.print("*");
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
    zero_One_Half_Triangle();
    butterfly_pattern(8);
    solid_Rhombus(10);
    diamond_pattern(5);
  }
}
