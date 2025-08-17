// 153 LC

class Solution {
    public int findMin(int[] a) {
        int s = 0;
        int e = a.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            // If mid element is greater than the rightmost, the min is in the right half
            if (a[m] > a[e]) {
                s = m + 1;
            } else {
                // Else, the min is in the left half (including mid)
                e = m;
            }
        }

        return a[s];  // or a[e], since s == e
    }
}
