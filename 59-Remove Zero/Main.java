import java.util.ArrayList;

class Solution {
    public long removeZeros(long n) {
        String b=String.valueOf(n);
        int[] arr=new int[b.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=b.charAt(i)-'0';
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                a.add(arr[i]);
            if(a.contains(0)){
                a.remove(Integer.valueOf(0));
            }
        }
        long val=0;
        for(int i:a){
            val=val*10+i;
        }
        return val;
    }
}