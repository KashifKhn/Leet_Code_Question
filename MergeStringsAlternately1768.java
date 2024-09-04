// Question Link: https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately1768 {
  public static String mergeAlternately(String word1, String word2) {
    String ext = "";
    if (word1.length() > word2.length()) {
      ext = word1.substring(word2.length());
      word1 = word1.substring(0, word2.length());
    } else {
      ext = word2.substring(word1.length());
      word2 = word2.substring(0, word1.length());
    }

    StringBuilder merge = new StringBuilder();
    for (int i = 0; i < word1.length(); i++) {
      merge.append(word1.charAt(i));
      merge.append(word2.charAt(i));
    }
    return merge.append(ext).toString();

  }

  public static void main(String[] args) {
    // String word1 = "abc", word2 = "pqr";
    String word1 = "ab", word2 = "pqrs";
    String str = mergeAlternately(word1, word2);
    System.out.println(str);
  }
}
