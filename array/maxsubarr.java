class maxsubarr {
    public static int maxSubArray(int[] nums) {
        int currentsum= 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++)
        {
            currentsum += nums[i];
            maxsum = Math.max(currentsum , maxsum);
            if(currentsum < 0)
            {
                currentsum = 0;
            }
        } return maxsum;
    }


      public static void main(String[] args) {

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

       System.out.println(maxSubArray(nums));
    }
    } 
