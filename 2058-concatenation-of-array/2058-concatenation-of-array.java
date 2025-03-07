class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length*2];
    int k =0;
    for(int i = 0;i<nums.length*2;i++){
        if(i >= 0 && i < nums.length ){
            ans[i]= nums[i];
        }else{
            ans[i]=nums[k++];
        }
    }
    return ans;
    }
}