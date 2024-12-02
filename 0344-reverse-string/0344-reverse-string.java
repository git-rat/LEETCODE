class Solution {
    public void reverseString(char[] s) {
        Stack<Character> k = new Stack<>();
        for(int i=0;i<s.length;i++){
            k.push(s[i]);
        }
        for(int i=0;i<s.length;i++){
           s[i]= k.pop();
        }
        for(int i=0;i<s.length;i++){
           System.out.print(s[i]);
        }
    }
}