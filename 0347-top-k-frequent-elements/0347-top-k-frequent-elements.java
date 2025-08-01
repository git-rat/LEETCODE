class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
         List<Integer> list = new ArrayList<>(map.values());
Collections.sort(list, Collections.reverseOrder());  
for(int i=list.size()-1;i>=k;i--){
    list.remove(i);
}
Set<Integer> set = new HashSet<>();
//List<Integer> li = new ArrayList<>();
int  h = 0;
for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    if(list.contains(entry.getValue())){
        //li.add(entry.getKey()); - this might create duplicates in the list 
        set.add(entry.getKey()); h++;
        if(h==k){
            break;
        }
    }    
}
int[] arr = new int[k];int u =0;  // cause of no i in for loop to keep track for arr
for(Integer i : set){
    arr[u++]= i;  //auto unboxing. need to be done manually for set to array 
}
return arr;



    }
}

//