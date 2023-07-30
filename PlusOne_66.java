// Question Link    https://leetcode.com/problems/plus-one/

public class PlusOne_66 {

    public static int[] plusOne(int[] digits) {

        int carry = 1;
        int i = digits.length - 1;
        while (i >= 0 && carry == 1) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            i--;
        }
        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int j = 1; j < res.length; j++) {
                res[j] = digits[j - 1];
            }
            return res;
        }

        return digits;
    }

    public static void main(String[] args) {

        // 9,8,9
        //   9,8,9,9
        // 9,8,7,6,5,4,3,2,1,0
        // 9,8,7,6,5,4,3,2,1,1
        int[] digits = {9,9,9};
        int[] res = plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
