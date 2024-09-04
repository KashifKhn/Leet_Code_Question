// Question Link  https://leetcode.com/problems/reverse-integer/description/

public class ReverseInteger_7 {
    public static int reverse(int x) {
        // to store the rever and take long to prevent over flow
        long reve = 0; 
        while (x != 0) {
            reve = (reve * 10) + (x % 10);
            x /= 10;
        }
        // if the enter number is bigger than intergar value
        // or less than according to condition of Question
        if (reve > Integer.MAX_VALUE || reve < Integer.MIN_VALUE) 
             return 0;
        else
            return (int) reve;
    }

    public static void main(String[] args) {
        int x = -321;
        int rev = reverse(x);
        System.out.println(rev);
    }
}
