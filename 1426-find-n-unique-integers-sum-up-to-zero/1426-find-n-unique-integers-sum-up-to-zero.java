class Solution {
    public int[] sumZero(int n) {
        int[] ar = new int[n];
     if(n%2 != 0){
        ar[n-1] = 0;
    }int j =1;
    for(int i=1;i<=(n/2)*2;i++){
        if(i%2==0){
            ar[i-1]= ar[i-2] * -1; 
        }else{
        ar[i-1] =j;
        j++;}
        
    }
   return ar; 
}

}