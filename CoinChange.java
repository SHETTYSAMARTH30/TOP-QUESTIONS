class CoinChange {
    public int coinChange(int[] coins, int amount) {
        
        int n=amount;
        int dp[]=new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=0;

        
        for(int amt=1; amt <= n; amt++){
            
            for(int j=0;j<coins.length;j++){
                if(amt >= coins[j])
                    dp[amt]=Math.min(dp[amt],dp[amt-coins[j]] + 1);
            }
        }
   
        return dp[amount] > amount ?-1 : dp[n];
    }
}
