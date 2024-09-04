// Question Link https://leetcode.com/problems/reverse-string/

public class ReverseString_344 {

    public static void reverseString(char[] s) {
        // int startIdx = 0;
        // int endIdx = s.length - 1;
        // while (startIdx < endIdx) {
        // char temp = s[startIdx];
        // s[startIdx] = s[endIdx];
        // s[endIdx] = temp;
        // startIdx++;
        // endIdx--;
        // }
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);

    }
}
