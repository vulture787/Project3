package DSA;

import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        int nums[] = findErrorNums(arr);
        System.out.println(Arrays.toString(nums));
    }
 public static int[] findErrorNums(int[] arr) {
        int nums[] = new int[2];
        int i = 0;
        while (i < arr.length) {

            int search = arr[i] - 1;
            if (arr[i] != arr[search]) {
                nums[0] = search + 1;
                nums[1] = 0;

            } else
                i++;


        }
        return nums;
    }
}
