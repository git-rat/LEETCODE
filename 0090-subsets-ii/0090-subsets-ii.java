class Solution {
    void bt(List<List<Integer>> l , List<Integer> t , int[] nums , int s , boolean[] used){
        l.add(new ArrayList<>(t));
        for(int i =s  ; i< nums.length ; i++){
        if(i>0 && nums[i]== nums[i-1] && !used[i-1]){
            continue;
        }
        used[i]=true;
        t.add(nums[i]);
        bt(l , t , nums , i+1 , used);
        used[i]=false;
        t.remove(t.size()-1);
    }}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        bt(l , new ArrayList<>() ,nums ,0 , new boolean[nums.length] );
        return l;
    }
}