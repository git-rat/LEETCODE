class Solution {
    
    int rem = 0;

    int help(int n) {
        if (n <= 9) {
            return n;
        } else {
              int rem = 0;
              int sum = 0;
            while (n != 0) {
                
                rem = n % 10;
                n = n / 10;
                sum += rem;
            }
            if (sum > 9) {
                return help(sum);
            }
            return sum;
        }
    }

    public int addDigits(int num) {
        return help(num);
    }
}
