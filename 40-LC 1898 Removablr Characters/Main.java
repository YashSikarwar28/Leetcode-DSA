class Solution {
    public int maximumRemovals(String s, String p, int[] r) {
        int a=0;
        int b=r.length;
        int ans=0;
        while(a<=b){
            int mid=a+(b-a)/2;
            if(canRemove(s,p,r,mid)){
                ans=mid;
                a=mid+1;
            }
            else{
                b=mid-1;
            }
        }
        return ans;
    }
    static boolean canRemove(String s,String p,int[] r,int mid){
        int n=s.length();
        int m=p.length();
        boolean[] b=new boolean[n];
        for(int i=0;i<mid;i++){
            b[r[i]]=true;
        }
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(!b[i] && s.charAt(i)==p.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
}