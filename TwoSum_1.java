// Question Link  https://leetcode.com/problems/two-sum/
public class TwoSum_1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // test case  nums = [3,2,4], target = 6
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] res = twoSum(nums, target);
        System.out.println("The Index is: (" + res[0] +", " + res[1]+ ")");
    }
}
