import java.util.Scanner;

public class Main {

  public static boolean searchIn2DArray(int array[][],int searchKey){
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        if(array[i][j]==searchKey){
          System.out.print("Searhch key is found at position "+"("+i+","+j+")");
          return true;
        }
      }
    }
    System.out.println("Search key not found");
    return false;
  }

public static void main(String[] args) {
    int array [][] = new int [3][3];//3 by 3 matrix
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<array.length;i++){//first loop for rows
      for(int j=0;j<array[0].length;j++){//second for columns where arry[0].length gives cloumn length
        /*
           0 1 2
         0 1 2 3 
         1 4 5 6
         2 7 8 9
         
         */

         array[i][j]=sc.nextInt();
      }
    }


    //printing 2D array;
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        System.out.print(array[i][j]+" ");
      }
      // after printing rows we need next line;
      System.out.println();
    }


    // search element in 2D array;
    searchIn2DArray(array, 0);
}
}