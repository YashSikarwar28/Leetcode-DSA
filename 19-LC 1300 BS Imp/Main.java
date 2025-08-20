import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 4, 9, 3 };
        int ans = answer(a, 10);
        System.out.println(ans);
    }

    static int answer(int[] a, int tar) {
        int st = 0;
        int e = Arrays.stream(a).max().getAsInt();
        int bestVal = 0;
        int minDiff = Integer.MAX_VALUE;
        while (st <= e) {
            int mid = st + (e - st) / 2;
            int sum = sum(a, mid);
            int diff = Math.abs(sum - tar);

            if (diff < minDiff || (diff == minDiff && mid < bestVal)) {
                bestVal = mid;
                minDiff = diff;
            }

            else if (sum < tar) {
                st = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return bestVal;
    }

    static int sum(int[] a, int val) {
        int s = 0;
        for (int num : a) {
            s += Math.min(num, val);
        }
        return s;
    }
}