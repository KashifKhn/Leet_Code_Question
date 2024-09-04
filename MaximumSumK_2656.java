// Question Link https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/
public class MaximumSumK_2656 {
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = findMax(nums);
        while (k > 0) {
            sum += max;
            max++; 
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        // test case nums = { 4,4,9,10,10,9,3,8,4,2,5,3,8,6,1,10,4,5,3,2,3,9,5,7,10,4,9,10,1,10,4};
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int res = maximizeSum(nums, k);
        System.out.println(res);
    }
}
