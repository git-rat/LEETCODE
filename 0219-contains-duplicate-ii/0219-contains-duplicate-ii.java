class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i]))<= k ){  //Math.abs - takes more time aroudn 5 seoconds maybe?

                    return true;
            }else{      // else is not needed , it will run perfectly wihout it- adds 1s
                        //first,both code that coould have been removed made the code come in 2nd , wihtout it code came at first 
                map.put(nums[i], i);}
                   
        }
        return false;
    }
}
