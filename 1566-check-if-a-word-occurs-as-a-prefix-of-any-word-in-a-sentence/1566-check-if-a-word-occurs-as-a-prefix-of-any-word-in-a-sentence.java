class Solution {
    public int isPrefixOfWord(String sentence, String m ) {
        String[] ar = sentence.split(" ");
        int a = m.length();
        for(int i=0;i<ar.length;i++){
            if(ar[i].length() < a){
                continue;
            }
            else if(ar[i].substring(0,a).equals(m)){
                return i+1;
            }
        } 
    return -1;
    }
}