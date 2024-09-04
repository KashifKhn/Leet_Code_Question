// Question Link    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstLastPositionSorted_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int firstIdx = 0;
        int lastIdx = nums.length-1;
        // for first
        while(firstIdx <= lastIdx)
        {
            int mid = (firstIdx + lastIdx)/2;
            if(nums[mid] == target)
            {   
                res[0] =  mid;
                lastIdx= mid - 1;
            }
            else if (nums[mid] < target)
                firstIdx = mid+1;
            else 
                lastIdx = mid-1;
        }
        // for last occu
        firstIdx = 0;
        lastIdx = nums.length-1;
        while(firstIdx <= lastIdx)
        {
            int mid = (firstIdx + lastIdx)/2;
            if(nums[mid] == target)
            {   
                res[1] =  mid;
                firstIdx= mid + 1;
            }
            else if (nums[mid] < target)
                firstIdx = mid+1;
            else 
                lastIdx = mid-1;
        }
        return res;
    }

    public static void main(String[] args) {
        // test case  
        // int[] nums = { 5,7,7,8,8,10 };
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println("The Index is: (" + res[0] + ", " + res[1] + ")");
    }
}
