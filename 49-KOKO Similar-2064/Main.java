class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int l=1;
        int r=Arrays.stream(q).max().getAsInt();
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(prod(n,q,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    static boolean prod(int n,int[] q,int mid){
        int qq=0;
        for(int i=0;i<q.length;i++){
            qq+=(int)(Math.ceil((double)q[i]/mid));
        }
        return qq<=n;
    }
}