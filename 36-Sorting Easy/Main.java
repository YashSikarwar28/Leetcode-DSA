import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        if(a.length==2) return true;
        int diff=a[1]-a[0];
        for(int i=2;i<a.length;i++){
            if(a[i]-a[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
}