class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and add one
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++; // Add one to the current digit
            if (digits[i] < 10) {
                // If no carry, return the array
                return digits;
            }
            // Handle carry over
            digits[i] = 0;
        }

        // If we are here, all digits were 9, and we need to resize the array
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the leading digit to 1
        return newDigits;
    }
}
