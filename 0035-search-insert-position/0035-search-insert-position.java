class Solution {
    private int b_s(int a, int b, int t, int[] ar){
        if(a>b) return a;
        int mid = a + (b-a)/2;   // or mid = (a+b)/2; but it might pass the limit of int
        if(ar[mid] == t){
            return mid;
        }else if(ar[mid] > t){
            return b_s(a,mid -1, t, ar);
        }else{
            return b_s(mid +1,b, t, ar);
        }
    
        
    }
    public int searchInsert(int[] nums, int target) {
         return b_s( 0, nums.length-1, target,nums);
    }
}