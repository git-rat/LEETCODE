class Solution {
    public char findTheDifference(String s, String t) {
         Map<Character,Integer> map = new HashMap<>();
             for(char i: s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
            }else{
                return i;
            }
        }  
        for(char i:t.toCharArray()){
            if(map.get(i)==-1){
                return i;
            }
        }
        return 'a';

    }
}