class Solution {
    public boolean wordPattern(String pattern, String s) {
       
        HashMap<Character,String> map = new HashMap<>();
        char[] c = pattern.toCharArray();
        String[] f = s.split(" ");
         if(c.length != f.length ){ return false;}
        for(int i=0;i<pattern.length();i++){
            map.putIfAbsent(c[i],f[i]); //if put below the if, no need to check for if absent 
            if(map.containsKey(c[i]) && ! map.get(c[i]).equals(f[i])){
                return false;
            }
        }
        for(int i=0;i<pattern.length();i++){
            for(int j=1;j<pattern.length();j++){
                if(c[i] != c[j]){
                if(map.get(c[i]).equals(map.get(c[j]))){
                    return false;
                }
                }
            }
        }

        return true;
    }
}