class Spreadsheet {
        int[][] mat;
    public Spreadsheet(int rows) {
         mat = new int[rows][26];

    }
    
    public void setCell(String cell, int value) {
       // cell = cell.substring(1);
      int col = cell.charAt(0)-'A';
      int row = Integer.parseInt(cell.substring(1)) - 1;
        mat[row][col] = value;
    }
    
    public void resetCell(String cell) {
     //  cell = cell.substring(1);
      int col = cell.charAt(0)-'A';
      int row = Integer.parseInt(cell.substring(1)) - 1;
        mat[row][col] = 0;
    }
    
    public int getValue(String formula) {
          int sum=0;
          formula = formula.substring(1); //rid of =
          String[] splited = formula.split("\\+");
          for(String i: splited){
            if(Character.isLetter(i.charAt(0))){
                int col = i.charAt(0)-'A';
                int row =Integer.parseInt(i.substring(1))-1;
               sum +=  mat[row][col];
            }else{
                sum += Integer.parseInt(i);
            }
          } 
        
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */