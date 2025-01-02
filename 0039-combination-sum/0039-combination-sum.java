class Solution {
    void bt(List<List<Integer>> list , List<Integer> temp ,int[] nums, int targ ,int start ){
        if(targ<0 ){
            return;
        }else if (targ == 0){
            list.add(new ArrayList<>(temp));
        }else{
            for(int i =start;i<nums.length;i++){
                temp.add(nums[i]);
                bt(list,temp,nums,targ-nums[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        bt(list ,new ArrayList<>() ,candidates,target,0 );
        return list;
    }
}