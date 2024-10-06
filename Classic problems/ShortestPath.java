class ShortestPath{
  public static float shortestPath(String path){
    int x=0,y=0;
    for(int i=0;i<path.length();i++){
      int dir = path.charAt(i);
      // west
      if(dir=='W'){
        x--;
      }else if(dir=='N'){
        y++;
      }else if(dir=='E'){
        x++;
      }else{
        y--;
      }
    }

    int X=x*x;
    int Y =y*y;

    //now squareroot by adding both;
    return (float)Math.sqrt(X+Y);
  }
  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(shortestPath(path));
  }
}