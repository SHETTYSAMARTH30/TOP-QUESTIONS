class Solution {
    public int myAtoi(String str) {
        
        int base=0, sign=1, i=0;
        
        
        while(i < str.length() && str.charAt(i) == ' '){
            i++;
        }
        
        if(i >= str.length())
            return 0;
        
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            if(str.charAt(i++) == '-')
                sign = -1;
        }
        
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)){
                
                 if(sign == -1)
                     return Integer.MIN_VALUE;
                else
                     return Integer.MAX_VALUE;
                
            }
        
            base = base * 10 + (str.charAt(i++) - '0');                                  
    } 
        
        return sign * base;
}
}
