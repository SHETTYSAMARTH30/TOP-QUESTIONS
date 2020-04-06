class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res=new LinkedList<>();
        for(int i=0; i < nums.length-2; i++){
            
            if(i==0 || (i > 0 && nums[i]!=nums[i-1])){
                
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];
                
            while(lo < hi){
             
                if(lo < hi && nums[lo]+nums[hi] == sum){
                    
                    res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    while(lo < hi && nums[lo]==nums[lo+1])
                            lo+=1;
                    
                    while(lo < hi && nums[hi]== nums[hi-1])
                            hi-=1;
                    
                    lo+=1;
                    hi-=1;
                }
                
                else if(lo < hi && nums[lo]+nums[hi] < sum)
                            lo++;
                else 
                            hi--;
            }
            }
        }
        
        return res;
    }
}
