class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int p =0;
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                if(grid[i][j] == 1){
                    int b = 4;
                    if(i-1 >=0 && grid[i-1][j] ==1){
                        b =b-1;
                    }
                     if(i+1 <rows && grid[i+1][j] ==1){
                        b = b-1;
                    }
                     if(j-1 >=0 && grid[i][j-1] ==1){
                        b = b-1;
                    }
                    if(j+1 <columns && grid[i][j+1] ==1){
                         b =b-1;
                    }
                    p+= b;
                }
            }
        }
        return p;
    }
}