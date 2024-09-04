// Question Link  : https://leetcode.com/problems/binary-search/

public class BinarySearch_704 {

    public static int binarySearch(int[] nums, int target)
    {
        int firstIdx = 0;
        int lastIdx = nums.length-1;
        while(firstIdx<=lastIdx)
        {
            int midIdx = (firstIdx + lastIdx)/ 2;
            if(nums[midIdx] == target)
                return midIdx;
            else if(nums[midIdx] < target)
                firstIdx = midIdx+1;
            else 
                lastIdx = midIdx -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,5,7, 9, 12};
        int target = 12;
        int index = binarySearch(nums, target);
        if(index == -1)
            System.out.println("Target not found");
        else 
            System.out.println("Target found at index: " + index);

        
    }
    
}
