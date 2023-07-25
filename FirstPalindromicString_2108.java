public class FirstPalindromicString_2108 {
    public static boolean isPalindrom(String str) {
        int firstIdx = 0;
        int lastIdx = str.length() - 1;
        while (firstIdx <= lastIdx) {
            if (str.charAt(firstIdx) != str.charAt(lastIdx))
                return false;
            firstIdx++;
            lastIdx--;
        }
        return true;
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrom(words[i]))
                return words[i];
        }
        return "";
    }
    public static void main(String[] args) {
        /*  test case 
        String [] words = {"notapalindrome","racecar"}; 
        String [] words = {"def","ghi"}; 
        */
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println("The First palindrome is : " + firstPalindrome(words));
    }

}