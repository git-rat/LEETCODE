class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> d = new  HashMap<>();
        for(int i =0;i<nums.length;i++){
                d.put(nums[i],d.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<=d.getOrDefault(0,0)-1;i++){
            nums[i] = 0;
        }
        for(int i=d.getOrDefault(0,0);i<(d.getOrDefault(1,0)+d.getOrDefault(0,0));i++){
            nums[i] = 1;
        }
        for(int i=(d.getOrDefault(1,0)+d.getOrDefault(0,0));i<nums.length;i++){
            nums[i] = 2;
        }

    }
}