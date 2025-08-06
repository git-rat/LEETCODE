class Solution {
    public List<Integer> getRow(int n) {
                ArrayList<List<Integer>> g ;
    
        g = new ArrayList<>(Arrays.asList((Arrays.asList(1))));
        g.add(Arrays.asList(1,1));
    

    for(int i=2;i<=n;i++){
        List<Integer> prev = g.get(i-1);
            List<Integer> r = new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){ 
                    r.add(1);
            }else{
                r.add((prev.get(j-1)+prev.get(j)));
            }
        }
        g.add(r);

    }
    return g.get(n);
        }
}
