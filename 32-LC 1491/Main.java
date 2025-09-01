class Solution {
    public double average(int[] a) {
        Arrays.sort(a);
        int c=0;
        int sum=0;
        double avg=0;
        for(int i=1;i<a.length-1;i++){
            if(a[i]>0){
                c++;
                sum+=a[i];
            }
        }
        if(c==0) return 0;
        avg=(double)sum/c;
        return avg;
    }
}