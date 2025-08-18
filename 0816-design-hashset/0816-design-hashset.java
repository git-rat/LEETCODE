class MyHashSet {
    int b_s (int a, int b, int t, ArrayList<Integer> ar){
    if  (a>b) return Integer.MAX_VALUE;
    else{
        int mid = (a+b)/2;
        if(ar.get(mid) == t){
            return t;
        }else{
            if(ar.get(mid) > t){
                return b_s(a,mid-1, t, ar);
            }else{
                return b_s(mid+1,b,t,ar);
            }
        }
    }
 }

     ArrayList<Integer> ar;
    public MyHashSet() {
         ar = new  ArrayList<Integer>();

    }
    
    public void add(int key) {
       // Collections.sort(ar);
        if(!ar.contains(key)){
            ar.add(key);
        }
    }
    
    public void remove(int key) {
        int m = ar.indexOf(key);
      if (m != -1) ar.remove(m);
    }
    
    public boolean contains(int key) {
        boolean g  = ar.contains(key);
        return g;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

 