// Question Link     https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FirstOccurrenceSubString_28 {

    public static int firstOccurrence(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();
        if (hayLen < needleLen)
            return -1;
        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issipi";
        // String haystack = "sadbutsad", needle = "sad";
        System.out.println(firstOccurrence(haystack, needle));
    }
}
