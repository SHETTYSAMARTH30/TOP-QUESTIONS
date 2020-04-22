class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();
        int longestStreak = 0;
        
        for(int n:nums){
            numSet.add(n);
        }
        
        for(int num : numSet){
            
            int currStreak = 1;
            
            if(!numSet.contains(num-1)){
                
                while(numSet.contains(num+1)){
                    num+=1;
                    currStreak+=1;
                }
                
                longestStreak = Math.max(longestStreak,currStreak);
            }
        }
        
        return longestStreak;
    }
}
