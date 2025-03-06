class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] number = new int[n*n];
        for(int i=0;i<n;i++){
          for  (int j=0;j<n;j++){
            number[grid[i][j]-1] += 1; 
          }
        }int a=0,b=0;
        for(int i=0;i<n*n;i++){
            if(number[i]==2){
                a=i+1;
            }if(number[i]==0){
                b=i+1;
            }
        }
        return new int[]{a,b};
    }
}