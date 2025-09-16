class Solution {
    List<Character> f = new ArrayList<>();
    private boolean isVowel(char a){
        a = Character.toLowerCase(a);
        return(a=='a'||a=='e'||a=='i'||a=='o'||a=='u' );
    }
    private String  devowel(String s){
       char[] l = s.toCharArray();
       int p =0;
       for(int i=0;i<l.length;i++){
        if(isVowel(l[i])){
            f.add(l[i]);  l[i] = '*';
        }
       }
       return new String(l);
    }

    public String reverseVowels(String s) {
          s = devowel(s); int v =0;
         char[] newj = s.toCharArray();
         int beg = f.size()-1;
         for(int i=0;i<newj.length;i++){
                if(newj[i] == '*'){
                    newj[i] =  f.get(beg--);
                }
         }
         return new String(newj);
         
    }
}