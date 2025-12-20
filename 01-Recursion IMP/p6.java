//Subset Sum
import java.util.ArrayList;
import java.util.Collections;
public class p6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(5);
        ArrayList<Integer> ans=new ArrayList<>();
        sum(0, 0, arr,ans, arr.size());
        Collections.sort(ans);
        System.out.println(ans);
    }

    static void sum(int sum,int ind,ArrayList<Integer> arr,ArrayList<Integer> ans,int N){
        if (ind==N) {
            ans.add(sum);
            return;
        }
        sum(sum+arr.get(ind), ind+1, arr, ans,N);
        sum(sum, ind+1, arr, ans,N);
    }
}


