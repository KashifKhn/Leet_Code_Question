// Question Link https://leetcode.com/problems/majority-element/description/


public class MajorityElement_169 {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (candidate == num) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 2, 3 };
        // int [] arr = {2,2,1,1,1,2,2};
        // int[] arr = { 2, 2, 1, 1, 1, 3, 2 };
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(majorityElement(arr));

    }
}
