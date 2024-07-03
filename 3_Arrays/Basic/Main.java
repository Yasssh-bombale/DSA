class Main {
    //linear search algorithm
  public static int linearSearch(int marks[],int key){
      
      for(int i=0;i<marks.length;i++){
          if(marks[i]==key){
              return i;
          }
      }
      
      return -1;
  }


  public static int getLargestNumber(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>largest){
            largest=numbers[i];
        }
    }
    
    return largest;
    
}

public static int getSmallestNumber(int numbers[]){
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]<smallest){
            smallest=numbers[i];
        }
    }
    
    return smallest;
}

  public static void main(String[] args) {
     int marks[] ={10,20,30,40,50,60,70};
     int key=40;
     
     int index = linearSearch(marks,key);
     if(index==-1){
         System.out.println("No index found");
     }else{
         System.out.println("Index is "+index);
     }
  }
}