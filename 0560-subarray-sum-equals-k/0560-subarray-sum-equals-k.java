class Solution {
    public int subarraySum(int[] n, int k) {
        int c =0;
        for(int i =0;i<n.length;i++){
            int sum =0;
            for(int j = i; j<n.length;j++){
                sum+= n[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;
    }
    
}