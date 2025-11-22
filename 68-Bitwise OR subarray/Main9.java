//LC 898 Bitwise OR subarray

import java.util.HashSet;
import java.util.Set;

public class Main9 {
    public static void main(String[] args) {
        int[] a={1,1,2};
        
        HashSet<Integer> b=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();
        HashSet<Integer> d=new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            for(int x:b){
                c.add(x|a[i]);
            }
            c.add(a[i]);
            d.addAll(c);
            b=new HashSet<>(c);
            c.clear();;
        }
        System.out.println(d.size());
    }
}