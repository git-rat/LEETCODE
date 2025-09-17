class Solution {
    public int firstUniqChar(String s) {
          Map<Character,Integer> map = new HashMap<>();
             for(char i: s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         for(char i: s.toCharArray()){
            if(map.get(i)==1){
                System.out.println(i);
                return s.indexOf(i);
            }
         }
        return -1;
    }
}