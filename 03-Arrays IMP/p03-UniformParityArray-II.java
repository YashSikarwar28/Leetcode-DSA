//LC 3876
//Parity means either all numbers are odd or even
//The answer depends on odd value, find smallest odd if it doen not exists that means everything is even - true, else if existes the even number present should be grater than the min odd to become true.
class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2!=0){
                odd=Math.min(i,odd);
            }
        }
        if(odd==Integer.MAX_VALUE) return true;
        for(int i:nums1){
            if(i%2==0 && i<odd) return false;
        }
        return true;
    }
}
