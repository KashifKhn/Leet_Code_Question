// Question Link:   https://leetcode.com/problems/is-subsequence/description/

public class IsSubsequence392 {
  public static boolean isSubsequence(String s, String t) {
    int lenS = s.length();
    int lenT = t.length();

    if (lenS == 0 || s.equals(t)) {
      return true;
    }
    if (lenS > lenT) {
      return false;
    }

    int j = 0;
    for (int i = 0; i < lenT; i++) {
      if (s.charAt(j) == t.charAt(i)) {
        j++;
      }
      if (j > lenS - 1) {
        return true;
      }
    }

    return false;

  }

  public static void main(String[] args) {

    System.out.println(isSubsequence("abcf", "ahbgdc"));

  }

}
