// Question Link : https://leetcode.com/problems/find-closest-number-to-zero/description/

public class FindClosestNumberToZero2239 {

  public static int closestNumber(int[] nums) {
    int result = nums[0];
    for (int i : nums) {
      if (Math.abs(i) < Math.abs(result)) {
        result = i;
      }
    }
    if (result < 0 && isContain(nums, Math.abs(result))) {
      return Math.abs(result);
    }
    return result;
  }

  public static boolean isContain(int[] nums, int value) {
    for (int i : nums) {
      if (i == value) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    // int[] nums = { -4, -2, 1, 4, 8 };
    int[] nums = { -2, -1, 1 };
    // int[] nums = { 2, 1, 1, -1, 100000 };
    // int[] nums = { -1000, -1000 };
    System.out.println(closestNumber(nums));
  }
}
