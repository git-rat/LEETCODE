class Solution {
    private boolean isValid(int x,int y , int row , int col){
        if(x>= 0 && y >= 0 && x < row && y < col) {
            return true;
        }
        return false;
    }
    public int[][] highestPeak(int[][] isWater) {
        int[] di = { 0 , 0 , 1 , -1 };
        int[] dj = { 1 , -1 , 0 , 0 };

        int row = isWater.length;
                int col = isWater[0].length;
        int[][] cellheight = new int[row][col];
        for(int[] i : cellheight){
            Arrays.fill(i , -1);
        }
             Queue<int[]> cp = new LinkedList();   
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(isWater[i][j]==1){
                    cellheight[i][j] = 0;
                    cp.add(new int[]{i,j});
                }
            }}
            int head = 1;
  while(!cp.isEmpty()){
    int layerSize = cp.size();

            // Iterate through all cells in the current layer
            for (int i = 0; i < layerSize; i++) {
    int[] current = cp.poll();
   

    for(int d=0;d<4;d++){
         int x = current[0] + di[d];
        int y = current[1] + dj[d];
             if(isValid(x,y, row , col) && cellheight[x][y] == -1 ){
        cellheight[x][y] = head;
        cp.add(new int[] {x,y} );

    }
    }
   
    }  head ++;
   

  }











        



return cellheight ;
    }
}