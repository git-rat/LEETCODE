

class Solution {
   
    public static int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
       for(int i =0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(i==j) continue;
            if(nums[i]+ nums[j] == target){
                r = new int[]{i,j};
            }

        }
       }return r;
    }

       
}
