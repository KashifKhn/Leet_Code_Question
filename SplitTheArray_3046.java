// Question Link https://leetcode.com/problems/split-the-array/description/

public class SplitTheArray_3046 {
    public static boolean isPossibleToSplit(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4 };
        // int[] nums = { 1, 1, 1, 2, 3, 4 };
        if (isPossibleToSplit(nums)) {
            System.out.println("spit");
        } else {
            System.out.println("not");
        }
    }
}
