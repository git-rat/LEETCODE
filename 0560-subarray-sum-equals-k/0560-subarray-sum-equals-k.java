class Solution {
    public int subarraySum(int[] n, int k) {
        int sum =0;
        for(int i=0;i<1;i++){
            if(n[i]==k){
            sum++;
        }
        }
       for(int i=1;i<n.length;i++){
        if(n[i]==k){
            sum++;
        }
            n[i] = n[i]+ n[i-1];
            if(n[i] == k){
                sum++;
            }
            if(i>1){
                for(int t = i;t>=2;t--){
                    if((n[i]-n[i-t])==k){
                        sum++;
                    }
                }
            }

       }return sum;
    }
    
}