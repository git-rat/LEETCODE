class Solution {
     private String method(long num, Map<Integer, Character>map ){
            int rem =0;
        StringBuilder s = new StringBuilder();
        while(num!=0){
            //rem =0;  rem updates int the next step by itself 
            rem = (int) (num % 16); //bracketting (num % 16) makes it so that num is not turned to int first thus giving unexpected behaviour when divided by 16
            if(map.containsKey(rem)){
                 s.append(map.get(rem));
                 System.out.println(map.get(rem));
            }else{
            s.append(rem);}
           num = num/16;
           System.out.println(s);
        }
        s.reverse();
        return s.toString();
        }

    public String toHex(int num) {
        if(num ==0) return "0";
        long n;
        if(num<0){
             n = num & 0xffffffffL; 
            // Negative numbers: the only extra step is treating them as unsigned 32-bit.
// 0xffffffffL = hexadecimal literal for 32 bits all set to 1, stored as a long (64-bit). 
// Could also use decimal 4294967295L, but hex is easier to read for bitmasks.  
// Bitwise AND preserves the lower 32 bits of num exactly.  
// The result is of type long because the highest-typed operand (0xffffffffL) is long.  
// After this, n is a positive long that holds the same 32-bit pattern as the original int.

        }else{
            n = num ;   // making every version long to pass to the method()
        }
        
        Map<Integer, Character> map = new HashMap<>();
        int m=0;
        for(int i=10;i<16;i++){
            map.put(i,((char)('a'+ m)));
            m++;
        }
        return method(n, map);
       
        
    }
}