class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder b = new StringBuilder();
        int n = columnNumber;int rem=0;
        while(n>0){
            n--;
            rem = 0;
            rem = n%26;
            n = n/26;
           b.append( (char) ('A'+ rem));
        }
        b.reverse();
        return b.toString();
    }
}