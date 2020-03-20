class Permutation {
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> output=new ArrayList<List<Integer>>();
        int n=nums.length;
        
        List<Integer> result=new ArrayList<>();
        
        for(int j: nums){
            result.add(j);
        }
        
        backtrack(n,output,result,0);
        return output;
    }
    
    public void backtrack(int length,List<List<Integer>> output
                         ,List<Integer> nums,int first){
        
        if(first == length){
            output.add(new ArrayList<>(nums));
        }
            
        
        for(int i=first; i < length; i++){
            
            Collections.swap(nums,first,i);
            backtrack(length,output,nums,first+1);
            Collections.swap(nums,first,i);
        }
    }
}
