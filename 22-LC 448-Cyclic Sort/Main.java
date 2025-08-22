import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        List<Integer> ans = new ArrayList()<>();
        Cyclic(a);
        for(int i=0;i<a.length;i++){
            if(a[i]-1 != i){
                ans.add(i+1);
            }
        }
        return ans;
    }
    void Cyclic(int[] a){
        int i=0;
        while(i<a.length){
            int corrIndex=a[i]-1;
            if(a[i]!=a[corrIndex]){
                Swap(a,i,corrIndex);
            }
            else{
                i++;
            }
        }
    }
    void Swap(int[] a,int f,int s){
        int temp=a[f];
        a[f]=a[s];
        a[s]=temp;
    }
}