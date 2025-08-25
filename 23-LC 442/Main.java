class Solution {
    public List<Integer> findDuplicates(int[] a) {
        ArrayList<Integer> arr = new ArrayList<>();
        Search(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                arr.add(a[i]);
            }
        }
        return arr;
    }
    void Search(int[] a){
        int i=0;
        while(i<a.length){
            int corrInd=a[i]-1;
            if(a[i]!=a[corrInd]){
                Swap(a,i,corrInd);
            }
            else{
                i++;
            }
        }
    }
    void Swap(int[] a,int f,int l){
        int temp=a[f];
        a[f]=a[l];
        a[l]=temp;
    }
}