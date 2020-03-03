class ProdExcptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int L[]=new int[nums.length];
        
        L[0]=1;
        
        for(int i=1;i < nums.length;i++){
            L[i]=nums[i-1]*L[i-1];
        }
        
        int R=1;
        
        for(int j=nums.length-1;j >=0; j--){
            L[j]=L[j]*R;
            R*=nums[j];
        }
       return L;
        
    }
}
