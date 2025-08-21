// 1346-Check If N and Its Double Exist


import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int j = search(a, 2 * a[i]);
            if (j != -1 && j != i) {
                return true;
            }
        }
        return false;
    }

    int search(int[] a, int tar) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == tar) {
                return mid;
            } else if (a[mid] < tar) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}