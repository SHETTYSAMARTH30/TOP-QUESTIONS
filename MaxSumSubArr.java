class MaxSumSubArr {
    public int maxSubArray(int[] nums) {
        
        int currSum=nums[0];
        int maxSum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],nums[i]+currSum);
            maxSum=Math.max(maxSum,currSum);
        }
        
        return maxSum;
    }
}

