// Question Link: https://leetcode.com/problems/trapping-rain-water/description/

public class TrappingRainWater_42 {

    public static int findTrapWater(int[] arr) {
        int len = arr.length;
        int[] leftAx = new int[len];
        int[] rightAx = new int[len];
        // for left Max
        leftAx[0] = arr[0];
        for (int i = 1; i < len; i++) {
//            if(leftAx[i-1] > arr[i])
//                leftAx[i] = leftAx[i-1];
//            else
//                leftAx[i] = arr[i];
            leftAx[i] = Math.max(leftAx[i - 1], arr[i]);
        }
        rightAx[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightAx[i] = Math.max(rightAx[i + 1], arr[i]);
        }
        int totalTrap = 0;
        int with = 1;
        for(int i=0; i<arr.length; i++)
        {
//            int waterLevel = rightAx[i] > leftAx[i] ?leftAx[i] : rightAx[i];
//            int waterLevel = Math.min(rightAx[i], leftAx[i]);
//            int trapWater = (waterLevel - arr[i]) * with;
//            int trapWater = (Math.min(rightAx[i], leftAx[i])- arr[i]) * with;
             totalTrap += (Math.min(rightAx[i], leftAx[i])- arr[i]) * with;
        }
        return totalTrap;
    }

    public static void main(String[] args) {
//            4, 2, 0, 6, 3, 2, 5     4,2,0,3,2,5    0,1,0,2,1,0,1,3,2,1,2,1
        int[] arr = {4,2,0,3,2,5};
        int res = findTrapWater(arr);
        System.out.println(res);
    }
}
