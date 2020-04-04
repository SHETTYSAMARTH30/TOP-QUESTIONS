class Solution {
    public List<String> WordBrk2(String s, List<String> wordDict) {
        
            return breakWord(s,wordDict,0);

    }
    
     HashMap<Integer, List<String>> map = new HashMap<>();
    
    public List<String> breakWord(String s, List<String> wordDict, int start){
        
        if(map.containsKey(start))
            return map.get(start);
        
        LinkedList<String> res = new LinkedList<>();
        
        if(start == s.length())
            res.add("");
        
        
        for(int end = start+1; end <= s.length(); end++){
            
            if(wordDict.contains(s.substring(start,end))){
                            
                List<String> list = breakWord(s,wordDict,end);

                for(String l : list){
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                    
                }

            }
        }
       
        map.put(start,res);
        return res;
    }
}
