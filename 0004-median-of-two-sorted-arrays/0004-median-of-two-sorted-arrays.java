class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two sorted arrays
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Add remaining elements of nums1 (if any)
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Add remaining elements of nums2 (if any)
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Calculate the median
        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            return merged[totalLength / 2];
        } else {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        }
    }
}
