// Question Link: https://leetcode.com/problems/length-of-last-word/

public class LengthLastWord_58 {
  public static int lengthOfLastWord(String s) {
    s = s.trim();
    String[] str2 = s.split(" ");
    return str2[str2.length - 1].length();
  }

  public static void main(String[] args) {
    // String s = " fly me to the moon ";
    String s = "luffy is still joyboy";
    System.out.println(lengthOfLastWord(s));
  }
}
