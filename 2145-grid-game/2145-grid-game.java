class Solution {
    public long gridGame(int[][] grid) {
        long fs = 0; //d
        long ss= 0;
        for(int n : grid[0]){
            fs += n;
        }
        long max = Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            fs = fs - grid[0][i];
            max = Math.min(max , Math.max(fs,ss));
            ss  = ss + grid[1][i];
        }
        return max;

    }
}

