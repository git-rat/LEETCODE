
public class Solution {

    public int findMaxLength(int[] nums) {
       HashMap<Integer , Integer> map = new HashMap<>();
       int max =0;
       int count =0;
       for(int i =0;i<nums.length;i++){
        if(nums[i]==1){
            count -= 1;
        }
        if(nums[i]==0){
            count += 1;
        }
        if(count == 0){
             max = Math.max( max , i +1);
        }
        
        if(map.containsKey(count)){
            if(count == 0){
             max = Math.max( max , i +1);
        }else {
              max = Math.max( max , i - map.get(count));
        }}else{
            map.put(count , i);
        }
        
       }
       return max;
    }
}
