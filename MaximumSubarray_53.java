// Question Link:   https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray_53 {
    public static void maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        System.out.println("Sum is " + maxSum);
    }
    public static void main(String[] args) {
        //        int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] arr = {1};
        maxSubArray(arr);
    }
}
