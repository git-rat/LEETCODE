class Solution {
    public int lengthOfLastWord(String s) {
        String[] rr = s.split(" ");
        int m =rr.length;
        return rr[m-1].length();
        
    }
}