class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length <3){
            return nums[nums.length-1];
        }
           /* Map<Integer,Integer> map = new HashMap<>();
            for( int i =nums.legnth-1) */
            int k =3;
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i] == nums[i+1]){
                    continue;
                }else{
                    k--;
                    if(k ==1){
                        return nums[i];
                    }
                }
            }
            
                return  nums[nums.length-1];
            
           
        }
    }
