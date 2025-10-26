import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (x, y) -> Integer.compare(Math.abs(x), Math.abs(y)));

        long res = 0;
        int n = arr.length;
        int l = 0, r = n - 1;
        int i = 0;

        while (l <= r) {
            long sq;
            if (i % 2 == 0) { // even index → take largest
                sq = (long) arr[r] * arr[r];
                r--;
            } else { // odd index → take smallest
                sq = (long) arr[l] * arr[l];
                l++;
                sq = -sq;
            }
            res += sq;
            i++;
        }
        return res;
    }
}
