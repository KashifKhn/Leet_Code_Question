// Question Link : https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class SquaresSortedArray_977 {

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        int eIdx = nums.length - 1;
        int sIdx = 0;
        int idx = nums.length - 1;
        while (sIdx <= eIdx) {
            if (Math.abs(nums[sIdx]) > Math.abs(nums[eIdx])) {
                temp[idx] = nums[sIdx] * nums[sIdx];
                sIdx++;
            } else {
                temp[idx] = nums[eIdx] * nums[eIdx];
                eIdx--;
            }
            idx--;

        }

        return temp;
    }

    public static void main(String[] args) {
        int [] nums = { -4, -1, 0, 3, 10 };
        // int[] nums = { -7, -3, 2, 3, 11 };
        int[] result = sortedSquares(nums);
        printArray(result);
    }

}