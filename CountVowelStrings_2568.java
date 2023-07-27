// Question Link   https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/

public class CountVowelStrings_2568 {
    
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int voS (String[] words, int left, int right)
    {
        int count = 0;
        while (left<=right)
        {

            if(isVowel(words[left].charAt(0)) && isVowel(words[left].charAt(words[left].length()-1)))
                count++;
            left++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] cars = {"hey","aeo","mu","ooo","artro"};
        int l= 1, r=4;
        int count = voS(cars, l, r);
        System.out.println("the count is: " + count);

    }
}
