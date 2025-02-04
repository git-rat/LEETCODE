class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];//int j=0;
        for(int i =0;i<t.length();i++){
          a[t.charAt(i) - 'a']++ ;
        }
        int[] b = new int[26];
        for(int i =0;i<s.length();i++){
          b[s.charAt(i) - 'a']++ ;
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        return false;
}}