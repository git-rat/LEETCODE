class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;int l =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                l++;
            }else{
                if(l >max) max = l;
                l=0;
            }
        }if(l >max) max = l;

        return max;
    }
}