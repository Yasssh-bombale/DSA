// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class TrappedRainWater {
        
    public static int trappedRainWater(int height[]){
        //calculate leftMaxBoundry=[];
        int leftMaxBoundry[]= new int[height.length];
        leftMaxBoundry[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMaxBoundry[i]=Math.max(height[i],leftMaxBoundry[i-1]);
        }
        // calculate rightMaxboundry=[];
        int rightMaxBoundry[]=new int[height.length];
        rightMaxBoundry[height.length-1]= height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMaxBoundry[i]=Math.max(height[i],rightMaxBoundry[i+1]);
        }
        
        // calculate water level and trapped water together;
        int trappedRainWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMaxBoundry[i],rightMaxBoundry[i]);
            
            trappedRainWater+=waterLevel-height[i];
        }
        
        // return trappedRainWaterl
        return trappedRainWater;
        
    }
    
    public static void main(String[] args) {
       int height[] ={4,2,0,6,3,2,5};
       System.out.println(trappedRainWater(height));//expected output 11;
    }
}