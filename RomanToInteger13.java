// Question Link: https://leetcode.com/problems/roman-to-integer/description/ 

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {
  public static int romanToInt(String s) {
    Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);
    int result = 0;
    int n = s.length();

    for (int i = 0; i < n; i++) {
      if (i < n - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
        int value = romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
        result += value;
        i++;
      } else {
        result += romanMap.get(s.charAt(i));
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    // String s = "III";
    System.out.println(romanToInt(s));
  }
}
