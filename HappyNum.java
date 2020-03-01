class HappyNum {
    
    public int getResult(int n){
        
        int result=0;
        while(n > 0){
            int r = n%10;
            n=n/10;
            result+=r*r;
        }
        
        return result;
    }
    
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<>();
        
        while(n!=1 && !set.contains(n)){
            
            set.add(n);
            n = getResult(n);
        }
        
        return n==1;
    }
} 
