class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int k=1;
            PriorityQueue<Integer> j = new PriorityQueue<>(Collections.reverseOrder());
        char[] num = s.toCharArray( );
        int[] m = new int[num.length];
for (int i = 0; i < num.length; i++) {
    m[i] = Character.getNumericValue(num [i]); // Convert each char to its numeric value
}
        while(k<n){
             HashMap<Integer,Integer> c = new HashMap<>();
            for(int i=0;i<k;i++){
               
                    c.put(m[i],c.getOrDefault(m[i],0)+1);
                
            }
            int o = c.getOrDefault(0,0);
            int sum =0;
            for(int l=k;l<n;l++){
                
                    sum +=  m[l];
                
            }
            j.add(o+sum);
            k++;
        }


        return j.peek();

    }
}