

class Solution {
    void bt(List<List<Integer>> l , List<Integer> t , int[] nums , int s){
        l.add(new ArrayList<>(t));
        for(int i =s  ; i< nums.length ; i++){
        t.add(nums[i]);
        bt(l , t , nums , i+1 );
        t.remove(t.size()-1);
    }}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
       // Arrays.sort(nums);
        bt(l , new ArrayList<>() ,nums ,0 );
        return l;
    }
}

