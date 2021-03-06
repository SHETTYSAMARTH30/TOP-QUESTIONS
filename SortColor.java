class SortColor {
    public void sortColors(int[] nums) {
        
        int p0=0,p2=nums.length-1;
        int curr=0;
        int temp;
        
        while(curr <= p2){
            
            if(nums[curr] == 2){
                temp=nums[curr];
                nums[curr]=nums[p2];
                nums[p2--]=temp;
            }
            
            else if(nums[curr] == 0){
                temp=nums[curr];
                nums[curr++]=nums[p0];
                nums[p0++]=temp;
            }
            else{
                curr++;
            }
        }
        
    }
}
