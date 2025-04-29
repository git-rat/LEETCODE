class Solution {
    public void moveZeroes(int[] nums) {
           for(int r = 0;r<nums.length;r++)
           {    
            if(nums[r]==0){
            for(int x=r+1;x<nums.length;x++){
            if(nums[x] !=0){
                nums[r] = nums[x];
                nums[x] =0;
                break;
            }
            }
            }
            

           }


            } 
    }