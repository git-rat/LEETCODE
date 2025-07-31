class Solution {
    public void sortColors(int[] nums) {
      int c0 =0, c1 =0;
      for(int i : nums){
        if(i == 0){
            c0++;
        }if(i ==1){
            c1++;
        }
      }
      int k=0;
      for(int i=0;i<c0;i++){
        nums[k++] = 0;
      }for(int i=0;i<c1;i++){
        nums[k++] = 1;
      }
      for(int i=c1+c0; i < nums.length;i++){
        nums[k++] = 2;
      }

    }    // getOrDefault use rather than get - or error for returning null
    
}     