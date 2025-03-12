class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        for(String h:strs){
            if(h.length()<min){
                min=h.length();
            }
        }
        String res = "";
        for( int i =0;i<min;i++ ){
             int c=0;char a = strs[0].charAt(i);
            for (int j=0;j<strs.length;j++){
               if(strs[j].charAt(i)==a){
                c++;
               }

            }
            if(c==strs.length){
                    res= res + strs[0].charAt(i);
            }else{
            return res;
            }
        }
        return res;

    }}