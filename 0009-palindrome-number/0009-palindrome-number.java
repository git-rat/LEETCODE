class Solution {
    public boolean isPalindrome(int x) {
        int rem ,no=0,f;
        f=x;
        if(x<0){
            return false;
        }
        while (x !=0){
            rem = x%10;
            x = x/10;
            no = (no*10 )+ rem ;
         }
         if (no == f){
            return true;
         }else{
            return false;
         }
    }
}