class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
         Map<Integer,Integer> hmap=new HashMap<>();
        
        int a[]=new int[2];
        
        for(int i=0;i<nums.length;i++){
            
            int compliment= target - nums[i];
            if(hmap.containsKey(compliment)){
                a[0]=hmap.get(compliment);
                a[1]=i;
            }
            else{
                hmap.put(nums[i],i);
            }
            
        }
        return a;
    }
}
