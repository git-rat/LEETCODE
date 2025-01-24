class Solution {
    int max(int ar[]){
        int n =ar.length;
        if(n ==0){
            return 0;
        }
        int m = ar[0];
        for(int i=1;i<n;i++){
                if(ar[i]> m){
                    m = ar[i];
                }
        } return m ;
    }
    public int getMaximumGenerated(int n) {
        int max = 1;
         int[] ar = new  int[n+1];
         ar[0] = 0;
         if(n>=1){
         ar[1] = 1;
         for (int i =2;i<n+1;i++){
            if(i%2 == 0){
                ar[i] = ar[i/2];
            }else{ar[i] = ar[i/2]+ ar[(i/2)+1];}
            
         }}
        return max(ar);
        }
        
    }
