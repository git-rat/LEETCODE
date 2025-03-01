class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int p=0;
        int[] r = new int[nums.length];
        for(int i : nums){
            if(i != 0){
                r[p++] = i;
            }
        }
        while(p != nums.length){
            r[p++] = 0;
        }
        return r;
    }
}