class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(int i=0; i < nums1.length;i++){
            set1.add(nums1[i]);   
        }
        
        for(int j=0; j < nums2.length;j++){
            set2.add(nums2[j]);   
        }
        
        if(set1.size() < set2.size())
            return helper(set1,set2);
        else
            return helper(set2,set1);

    }
    
    public int[] helper(HashSet<Integer> set1, HashSet<Integer> set2){
        
        int output[]=new int[set1.size()];
        int id=0;
        
        for(Integer i: set1){
            if(set2.contains(i))
                output[id++]=i;
        }
        
        return Arrays.copyOf(output,id);
        
    }
}
