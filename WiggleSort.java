class WiggleSort {
    public void wiggleSort(int[] nums) {
        
        int median=findKLargest(nums,(nums.length+1)/2);
        int tmpArr[]=new int[nums.length];
        
        int odd=1;
        int even=(nums.length)%2==0?nums.length-2:nums.length-1;
        
        for(int i=0;i< nums.length;i++){
            
            if(nums[i] < median){
                tmpArr[even]=nums[i];
                even-=2;
            }
            if(nums[i] > median){
                tmpArr[odd]=nums[i];
                odd+=2;
            }
                
        }
        
        while(even >= 0){
            tmpArr[even]=median;
            even-=2;
        }
        
        while(odd < nums.length){
            tmpArr[odd] = median;
            odd+=2;
        }
        
        for(int j=0; j<tmpArr.length; j++)
            nums[j]=tmpArr[j];
        
    }
    
    public int findKLargest(int nums[],int k){
        
        PriorityQueue<Integer> heap=new PriorityQueue<>((n1,n2) -> n1-n2);
        
        for(int n:nums){
            heap.add(n);
            
            if(heap.size() > k)
                heap.poll();
        }
        
        return heap.poll();
    }
}
