class MaxProdSubArr {
    public int maxProduct(int[] nums) {
        
        int max=nums[0];
        int maxProduct=max;
        int minProduct=max;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i] < 0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            
            maxProduct=Math.max(nums[i],nums[i]*maxProduct);
            minProduct=Math.min(nums[i],nums[i]*minProduct);
            
            max=Math.max(max,maxProduct);
        }
        
        return max;
    }
}
