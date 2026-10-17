//LC 3551
//Sort the array using the digit sum and then the original number then we will compare this new sorted array woth the original one if both number are at correct index we will increase the pointer otherwise we will swap both the number and increase the counter.
class Tuple {
    int num;
    int sum;
    int ind;

    Tuple(int num, int sum, int ind) {
        this.num = num;
        this.sum = sum;
        this.ind = ind;
    }
}

class Solution {
    public int minSwaps(int[] nums) {
        Tuple[] arr = new Tuple[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sum = 0;
            while (nums[i] != 0) {
                sum += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            arr[i] = new Tuple(temp, sum, i);
        }
        //custom sorting part
        Arrays.sort(arr, (a, b) -> {
            if (a.sum == b.sum)
                return Integer.compare(a.num, b.num);
            return Integer.compare(a.sum, b.sum);
        });
        int i = 0;
        int swap = 0;
        while (i < nums.length) {
            if (arr[i].ind == i) {
                i++;
            } else {
                int original = arr[i].ind;
                //swapping if the original and sorted are not equal
                Tuple t = arr[i];
                arr[i] = arr[original];
                arr[original] = t;
                swap++;
            }
        }
        return swap;
    }
}
