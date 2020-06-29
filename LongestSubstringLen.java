class LongestSubstringLen {
    public int lengthOfLongestSubstring(String s) {
        
        //To store the index of Character
        Map<Character,Integer> map = new HashMap<>();
        int n=s.length(), ans=0;
        
        for(int i=0,j=0; j<n; j++){
            
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j)));
            }
            
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        
        }
        
        return ans;
    }
}
