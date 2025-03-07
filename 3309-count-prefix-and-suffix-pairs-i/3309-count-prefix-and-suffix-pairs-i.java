class Solution {
    boolean isPrefixAndSuffix(String a,String b ){
        int n1 = a.length();
        int n2 = b.length();
        if(n1>n2) return false;
        
        if((b.regionMatches(0 ,a,0,n1))&& (b.regionMatches(n2-n1 ,a ,0 , n1))){return true;}
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
       for(int i =0;i< words.length;i++){
        for(int j=i+1;j<words.length; j++){
            
           if(isPrefixAndSuffix(words[i] , words[j])){
            c++;}
           
        }
       }
       return c;
    }
}


/* didnt do j=i+1 ; n1>n2 -> false , not check logic with edge cases   - at first 









*/