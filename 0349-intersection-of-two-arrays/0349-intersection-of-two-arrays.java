class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
         Set<Integer> s2 = new HashSet<>();
         for(int i =0;i<nums1.length;i++){
                s1.add(nums1[i]);
         }
         for(int i =0;i<nums2.length;i++){
                s2.add(nums2[i]);
         }int n; LinkedList<Integer> l = new LinkedList<Integer>() ;
         if(s1.size()> s2.size()){
            // arr = new int[s2.size()];int h=0;
            
            for(int i : s2){
                if(s1.contains(i)){
                    l.add(i);
                   // h++; 
                }
            }
         }else{
           //  arr = new int[s1.size()];int g=0;
         //  LinkedList<Integer> l;
            for(int i : s1){
         if(s2.contains(i)){
                   l.add(i);
                   // g++; 
                }


         }

         

    }
     Integer[] temp= l.toArray(new Integer[0]);
    int[] arr = new int[temp.length];
for (int i = 0; i < temp.length; i++) {
    arr[i] = temp[i];  // unboxing
}
     return arr;  
}
}