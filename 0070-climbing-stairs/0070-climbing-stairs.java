class Solution {
    int help(int n,int[] dp){
         if(dp[n]!= -1){
                return dp[n];
            }
            if(n==1||n==2){
                return dp[n] = n;
            }
           
            return dp[n] = help(n-1 , dp)+ help(n-2 , dp);
        }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp);
    }
}