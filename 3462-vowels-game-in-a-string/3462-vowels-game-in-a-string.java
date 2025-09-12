class Solution {
    public boolean doesAliceWin(String s) {
       char[] sr = s.toCharArray();
       int count =0; 
       for(int i=0;i<s.length(); i++){
        if(sr[i] == 'a'||sr[i]== 'e'||sr[i]== 'i'||sr[i]== 'o'||sr[i]== 'u'){
                count++;
        }
       }
       if(count ==0){
        return false;
       }
       if(count ==1){
        return true;
       }
       if(count%2 != 0){
        return true;
       }
       return true ;
    }
}