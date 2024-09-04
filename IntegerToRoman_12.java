// Question Link: https://leetcode.com/problems/integer-to-roman/description/

public class IntegerToRoman_12 {
    private static final int[] VALUES = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
    };
    private static final String[] SYMBOLS = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
    };

    public static String toRoman(int num) {
        // StringBuilder roman = new StringBuilder();
        // for (int i = 0; i < VALUES.length; i++) {

        // while (num >= VALUES[i]) {
        // roman.append(SYMBOLS[i]);
        // num -= VALUES[i];
        // }
        // }
        // return roman.toString();

        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999");
        }

        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                num -= VALUES[i];
            } else {
                i++;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {

        int num = 3;
        System.out.println(toRoman(num));
    }
}
