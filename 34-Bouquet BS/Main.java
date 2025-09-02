import java.util.Arrays;

class Solution {
    static boolean possible(int[] a,int days,int m,int k){
        int c=0;
        int flow=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=days){
                c++;
            }
            else{
                flow+=(c/k);
                c=0;
            }   
        }
        flow+=(c/k);
        return flow>=m;
    }
    public int minDays(int[] a, int m, int k) {
        if(a.length<(long)m*k) return -1;
        int min=Arrays.stream(a).min().getAsInt();
        int max=Arrays.stream(a).max().getAsInt();
        while(min<=max){
            int mid=min+(max-min)/2;
            if (possible(a,mid,m,k)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
} 