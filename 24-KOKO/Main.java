class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int s=1;
        int e=Arrays.stream(a).max().getAsInt();
        while(s<e){
            int mid=s+(e-s)/2;
            int k=0;
            for(int i:a){
                k+=(int)Math.ceil((double)i/mid);
            }
            if(k<=h){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}