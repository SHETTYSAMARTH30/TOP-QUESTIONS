class GenParenthesis {
    public List<String> generateParenthesis(int n) {
        
        List<String> output=new ArrayList<>();
        backtrack(output,0,0,n,"");
        return output;
    }
    
    public void backtrack(List<String> output,int open,int close,int n,String str){
        
        if(str.length()==n*2){
            output.add(str);  
            return;
        }
        
        if(open < n)
                backtrack(output,open+1,close,n,str+"(");
            
        if(close < open)
                backtrack(output,open,close+1,n,str+")");
         
    }
}
