import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
    public String sortSentence(String s) {
        String[] t = s.split(" ");
        String[] f = new String[t.length];
    int c =0;
    for(int j=1;j<=t.length;j++){
        for(int i=0;i<t.length;i++){
        Pattern p = Pattern.compile(String.valueOf(j) + "$");
        Matcher match = p.matcher(t[i]);
        if(match.find()){
            f[c] =t[i].substring(0,t[i].length()-1);
            c++;
            break;
        }
        
        }}
        
     String fuk = String.join(" ", java.util.Arrays.copyOf(f, c));

      return fuk;
    }
}