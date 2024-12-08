import java.util.HashMap;
import java.util.Map;

public class StringCompression433 {
  public int compress(char[] chars) {
    Map<Character, Integer> counter = new HashMap<>();

    for (char c : chars) {
      if (counter.get(c) > 0) {
        counter.put(c, counter.get(c) + 1);
      } else {
        counter.put(c, 1);
      }
    }
    int i = 0;
    for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
      char key = entry.getKey();
      int value = entry.getValue();

      if (value == 1) {
        chars[i] = key;
      } else {
        if (value > 9) {

        } else {
          chars[i] = key;
          i++;
          chars[i] = 7;
        }
      }

    }

    return 0;

  }
}
