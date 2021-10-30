package DSA;

import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        int nums[] = findErrorNums(arr);
        System.out.println(Arrays.toString(nums));
    }
