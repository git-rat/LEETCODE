class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        if(brokenLetters.length()==26){
            return 0;
        }
        String[] words = text.split(" ");
        if(brokenLetters.length()==0){
            return words.length;
        }
        int k = words.length; 
        System.out.println(k);
        for(int i=0;i< words.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(words[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    System.out.println(k);
                        k--; 
                        break;
                        
                }
            }
        }
        return k;

    }
}