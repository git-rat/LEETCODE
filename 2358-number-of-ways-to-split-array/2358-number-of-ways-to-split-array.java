class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long  sum = 0,m=0;
        int v=0; 
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            m+=nums[i];
            if(m >= sum-m){
                v++;
            }
        }
return v;
    }
}