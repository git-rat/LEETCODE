class Solution {
    public boolean isSubsequence(String s, String t) {
        int c = s.length();
        if(c==0) return true;
        int h=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(h)){
                c--;
                h++;
                if(h==s.length()) break;
                
            }
        }
        if(c != 0){
            return false;
        }
        return true;
    }
}