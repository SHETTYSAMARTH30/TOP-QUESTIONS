class PerfectSquares {
    public int numSquares(int n) {
        
        //Time = O(n*sqrt(n)), Space=O(n)
        int dp[] = new int[n+1];
        
        //We store the dp with maximum number of perfect squares required to sum to n
        Arrays.fill(dp,n);
        
        //Least no of perfect squares to sum 0 is 0 and 1 is 1 (ie 1)
        dp[0] = 0;
        dp[1] = 1;
        
        //Finding min number of perfect squares that sum to i.
        //dp[i] = Min(dp[i], dp[i-j] + 1)
        for(int i = 2; i <= n; i++){
            
            for(int j = 1; j*j <= i; j++){
                
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        return dp[n];
    }
}
