class Solution {
    int help(int n,int[] dp){
         if(dp[n]!= -1){
                return dp[n];
            }
          else{
          for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
          }}
        return dp[n];
        }
    public int fib(int n) {
        int[] dp = new int[n+2];
        Arrays.fill(dp,-1);
         dp[0] = 0;
         dp[1] = 1;
        return help(n,dp);
       
    }
}