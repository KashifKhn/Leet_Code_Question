// Question Link https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumLessThanTarget_28234 {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // int[] num = { -1, 1, 2, 3, 1 };
        int[] num = { -6, 2, 5, -2, -7, -1, 3 };
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i : num) {
            nums.add(i);
        }
        int target = -2;
        System.out.println(countPairs(nums, target));
    }
}
