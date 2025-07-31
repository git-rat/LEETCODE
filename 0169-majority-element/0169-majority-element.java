class  Solution {

        public int majorityElement(int[] nums){
     HashMap<Integer , Integer> hash = new HashMap<>();
     for (int num :nums ){
        hash.put(num , hash.getOrDefault(num,0)+1);
     }
     for(Map.Entry<Integer,Integer> entry : hash.entrySet() ){
        if(entry.getValue() > nums.length/2 ){
            return entry.getKey();

        }
     } return -1;

        }
}
//check other ans in the submissions 
//get varsha laptop for other submisiion and post it 
