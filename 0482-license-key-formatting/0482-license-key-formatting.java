class Solution {
    public String licenseKeyFormatting(String s, int k) {
      StringBuilder sb = new StringBuilder();
    // char[] p = s.toCharArray();  - not needed 
    //3 ways of string to char  1) using s.charAt(i)  2)s.toCharArray()  3) using 2nd option in for each loop when u just wanna iterate 
      int count =0;
      for(int i=s.length()-1;i>=0;i--){
        char r= s.charAt(i);
        if( r != '-'){
            sb.append(Character.toUpperCase(r));
            count++;
             if(count % k == 0){
            sb.append('-');
        }
        }
        
      }
      if(sb.length()> 0 && sb.charAt(sb.length()-1)=='-'){
                sb.deleteCharAt(sb.length()-1) ;
      }
     return sb.reverse().toString();

      }
    }
