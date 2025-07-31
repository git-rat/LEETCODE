class Solution {
     void merge(int[] arr, int left, int mid, int right){
            int n1 = (mid - left) +1;
            int n2 = right - mid ;
            int[] L = new int[n1];
             int[] R = new int[n2];
             for(int i =0;i<n1;i++){
                L[i] = arr[left +i];
             }
             for(int i =0;i<n2;i++){
                R[i] = arr[mid+1+i];      // can't use the same for loop casue n1 and n2 can be of diff size 
             }
             int i=0,j=0,k=left;
             while(i<n1 && j <n2){
                if(L[i]<= R[j]){
                    arr[k++] = L[i++];
                }else{
                    arr[k++] = R[j++];
                }
             }
             while(i<n1){
                arr[k++] = L[i++];
             }
             while(j<n2){
                    arr[k++] = R[j++];

             }

        }


        void mergesort(int[] arr, int left, int right){
            if(left >= right) return ;   //>= rather than == for safety measures through buys like mergesort(arr,5,4);
            int mid = (right + left) /2;
            mergesort(arr,left, mid );
            mergesort(arr,mid+1, right);
            merge(arr, left,mid, right);
        }

    public int[] sortArray(int[] nums) {
        mergesort(nums , 0 , nums.length-1);
        return nums;
    }
}

//its mergeSort  