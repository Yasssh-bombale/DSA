public class SpiralMatrix {

  public static void printSpiralMatrix(int matrix[][]){
    int startRow=0;
    int startCol=0;
    int endRow=matrix.length-1;
    int endCol=matrix[0].length-1;

    while(startRow<=endRow && startCol<=endCol){
      //print top;
      for(int j=startCol;j<=endCol;j++){
        System.out.print(matrix[startRow][j]+" ");
      }

      //print right;
      for(int i=startRow+1;i<=endRow;i++){
        System.out.print(matrix[i][endCol]+" ");
      }

      //print Bottom;
      for(int j=endCol-1;j>=startCol;j--){
        if(startRow==endRow){
          break;
        }
        System.out.print(matrix[endRow][j]+" ");
      }

      //print left;
      for(int i=endRow-1;i>startRow;i--){
        if (startCol==endCol) {
          break;
        }
        System.out.print(matrix[i][startCol]+" ");
      }

      startCol++;
      startRow++;
      endCol--;
      endRow--;
    }
  }
  public static void main(String[]args){
    int matrix[][]={
       {1,2,3,4,21},
       {5,6,7,8,22},
       {9,10,11,12,23},
      { 13,14,15,16,24},
      { 25,26,27,28,29}
    };
    // int matrix[][] = {{1,2,3,21},{4,5,6,22},{7,8,9,23}};  //added if break condition for this matrix;

    printSpiralMatrix(matrix);
  }
}
