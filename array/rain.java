public class rain {
    
    public int trap(int[] height) {
      //left boundary
        int leftmax[]= new int[height.length];
        leftmax[0]= height[0];
        for (int i=1 ; i<height.length;i++)
        {
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
               // right boundary
        int rightmax[]= new int[height.length];
        rightmax[height.length-1]= height[height.length-1];
        for (int i=height.length-2 ; i>=0;i--)
        {
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }

        // traped water
         
        int trapedwater = 0;
        for (int i=0 ; i<height.length;i++){
            //water level
           int waterlevel= Math.min(leftmax[i],rightmax[i]);
           trapedwater += waterlevel-height[i];
        }
        return trapedwater;
    }
}

