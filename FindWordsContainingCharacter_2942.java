// Question Link https://leetcode.com/problems/find-words-containing-character/description/

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {

    public static boolean checkChar(String word, char x) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x)
                return true;
        }
        return false;
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (checkChar(words[i], x)) {
                count.add(i);
            }
        }
        return count;
    }
}
