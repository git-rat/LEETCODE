class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i =1;i<nums.length;i++){
           // nums[i] = nums[i] + nums[i-1];
            if(( nums[i] + nums[i-1])%2 == 0){
                return false;
            }
        }
        return true;
    }
}