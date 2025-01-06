class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> d = new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)-'0'== 1){
                d.add(i);
            }
        }
        int[] m = new int[boxes.length()];
        Arrays.fill(m ,0);
        for(int i = 0;i<boxes.length();i++){
            for(int j=0;j<d.size();j++){
                if(i==d.get(j)){continue;}
                if(i>d.get(j)){
                  m[i]  += i - d.get(j);
                }else{
                    m[i]  += d.get(j) - i;
                }
            }
        }return m ;
    }
}