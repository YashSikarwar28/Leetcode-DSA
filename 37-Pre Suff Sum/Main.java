class Solution {
    public int waysToSplitArray(int[] a) {
        long sum=0;
        for(int s:a){
            sum+=s;
        }
        long pre=0;
        int c=0;
        for(int i=0;i<a.length-1;i++){
            pre+=a[i];
            long suff=sum-pre;
            if(pre>=suff){
                c++;
            }
        }
        return c;
    }
}